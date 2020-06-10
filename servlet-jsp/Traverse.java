import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Traverse {
    public static void main(String[] args) {
        Path currentPath = Paths.get(".");

        try {
            Stream<Path> stream = Files.find(currentPath, 10,
                    (p, a) -> p.toString().endsWith("pom.xml")
                            && a.isRegularFile());
            stream.forEach(Traverse::changeContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void changeContent(Path path) {
        String newName = path.getParent().getFileName().toString();
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(path.toFile());
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xPath = xPathFactory.newXPath();
            XPathExpression expression;
            expression = xPath.compile("/project/artifactId/text() | //finalName/text()");
            Object result = expression.evaluate(document, XPathConstants.NODESET);
            NodeList nodeList = (NodeList) result;
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println(nodeList.item(i).getNodeValue());
                System.out.println("上面是原来的----------");
                System.out.println("想改成： " + newName);
                nodeList.item(i).setNodeValue(newName);
                System.out.println();
                System.out.println("分割线-------------");
            }

            // 加了 Transformer.transform 修改就有效了。
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.transform(new DOMSource(document), new StreamResult(path.toFile()));
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException | TransformerException e) {
            e.printStackTrace();
        }
    }

}