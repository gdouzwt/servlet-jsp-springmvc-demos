<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; UTF-8" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>登录</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>
<div id="global">
    <form:form modelAttribute="login" action="login" method="post">
        <fieldset>
            <legend>登录</legend>
            <p>
                <label for="userName">用户名：</label>
                <form:input id="userName" path="userName" cssErrorClass="error"/>
            </p>
            <p>
                <label for="password">密码：</label>
                <form:password id="password" path="password" cssErrorClass="error"/>
            </p>
            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5"
                       value="登录">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
