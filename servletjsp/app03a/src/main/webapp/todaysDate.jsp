<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>

<html>
<head>
    <title>Today's date</title>
</head>
<body>
<%
    // 改为使用 Java 8 的日期时间 API
    DateTimeFormatter dateFormat = DateTimeFormatter.ISO_DATE_TIME;
    String s = dateFormat.format(LocalDateTime.now());
    out.println("今天的日期是: " + s);
%>
</body>
</html>
