<%@page errorPage="errorHandler.jsp" contentType="text/html;charset=UTF-8" %>
Deliberately throw an exception
<%
    Integer.parseInt("Throw me");
%>
