<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>JSP Implicit Objects</title>
</head>
<body>
<%
    for (Enumeration<String> e = request.getHeaderNames(); e.hasMoreElements(); ) {
        String header = e.nextElement();
        out.println(header + ": " + request.getHeader(header) + "<br/>");
    }
%>
<hr/>
<%
    out.println("Buffer size: " + response.getBufferSize() + "<br/>");
    out.println("Session id: " + session.getId() + "<br/>");
    out.println("Servlet name: " + config.getServletName() + "<br/>");
    out.println("Servlet info: " + application.getServerInfo() + "<br/>");
%>
</body>
</html>
