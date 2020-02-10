<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2020/2/9
  Time: 下午9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<base href="http://localhost:8080/webapp/">
<head>
    <meta charset="UTF-8">
    <title>欢迎</title>
    <link rel="stylesheet" href="${contextPath}/css/bootstrap.min.css">
</head>
<body>
<h1>测试页面</h1>
<article>
    <ul>
        <li><a href="app03a/declarationTest.jsp">declarationText</a></li>
        <li><a href="app03a/buggy.jsp">buggy</a></li>
        <li><a href="app03a/errorHandler.jsp">errorHandler</a></li>
        <li><a href="app03a/getSetPropertyTest.jsp">getSetPropertyTest</a></li>
        <li><a href="app03a/implicitObjects.jsp">implicitObjects</a></li>
        <li><a href="app03a/jspIncludeTest.jsp">jspIncludeTest</a></li>
        <li><a href="app03a/lifeCycle.jsp">lifeCycle</a></li>
        <li><a href="app03a/scriptletTest.jsp">scriptletTest</a></li>
        <li><a href="app03a/todaysDate.jsp">todaysDate</a></li>
        <li><a href="app03a/useBeanTest.jsp">useBeanTest</a></li>
        <li><a href="app03a/welcome.jsp">welcome</a></li>
        <li><a href="app03a/main.jsp">main</a></li>
    </ul>
</article>
</body>
</html>
