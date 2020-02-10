<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="utf-8" %>
<jsp:useBean id="product" scope="request" type="io.zwt.spring.app16a.domain.Product"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Save Product</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row">
        <h4>The product has been saved.</h4><br>
        <h5>Details:</h5><br>
        Product Name: ${product.name}<br/>
        Description: ${product.description}<br/>
        Price: $${product.price}
    </div>
</div>
</body>
</html>