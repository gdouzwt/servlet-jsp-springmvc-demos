package io.zwt.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
@Log4j2
public class ImageController {

    private static final Log logger = LogFactory.getLog(ImageController.class);

    @RequestMapping(value = "/image_get/{id}", method = RequestMethod.GET)
    public void getImage(@PathVariable String id,
                         HttpServletRequest request,
                         HttpServletResponse response,
                         @RequestHeader String referer) {
        if (referer != null) {
            String imageDirectory = request.getServletContext().
                getRealPath("/WEB-INF/image");
            File file = new File(imageDirectory,
                id + ".jpg");
            if (file.exists()) {
                log.debug("Hello-------------------------------------------------");
                response.setContentType("image/jpg");
                byte[] buffer = new byte[1024];
                // if you're using Java 7, use try-with-resources
                try (FileInputStream fis = new FileInputStream(file);
                     BufferedInputStream bis = new BufferedInputStream(fis)) {
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                } catch (IOException ex) {
                    // do something here
                }
            }
        }
    }
}
