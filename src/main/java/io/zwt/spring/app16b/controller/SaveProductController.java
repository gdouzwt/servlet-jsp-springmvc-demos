package io.zwt.spring.app16b.controller;

import io.zwt.spring.app16b.domain.Product;
import io.zwt.spring.app16b.form.ProductForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SaveProductController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request,
                                HttpServletResponse response) {

        ProductForm productForm = new ProductForm();
        // populate form properties
        productForm.setName(
            request.getParameter("name"));
        productForm.setDescription(
            request.getParameter("description"));
        productForm.setPrice(request.getParameter("price"));

        // create model
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(
                productForm.getPrice()));
        } catch (NumberFormatException ignored) {
        }

        // insert code to add product to the database

        request.setAttribute("product", product);
        return "/app16b/jsp/ProductDetails.jsp";
    }

}
