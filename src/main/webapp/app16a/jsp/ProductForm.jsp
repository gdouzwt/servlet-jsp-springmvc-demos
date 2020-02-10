<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Add Product Form</title>
    <%--<style type="text/css">@import url(/css/bootstrap.min.css);</style>--%>
    <%--<style type="text/css">@import url(/css/main.css);</style>--%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>

<div class="container-fluid">
    <div class="row" style="margin: 20px">
        <div class="col-4 offset-4">
            <form action="product_save.action" method="post">
                <h4>添加一个产品</h4>
                <div class="form-group">
                    <label for="name">产品名：</label>
                    <input type="text" id="name" name="name"
                           tabindex="1">
                </div>
                <div class="form-group">
                    <label for="description">产品描述：</label>
                    <input type="text" id="description"
                           name="description" tabindex="2">
                </div>
                <div class="form-group form-check">
                    <label for="price" class="form-check">价格：</label>
                    <input type="text" id="price" name="price"
                           tabindex="3">
                </div>
                <p id="buttons">
                    <input id="reset" type="reset" tabindex="4">
                    <input id="submit" type="submit" tabindex="5"
                           value="添加产品">
                </p>
            </form>
        </div>
    </div>
</div>
</body>
</html>
