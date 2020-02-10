package io.zwt.spring.app17b.controller;


import io.zwt.spring.app17b.domain.Product;
import io.zwt.spring.app17b.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SaveProductController implements Controller {

    private static final Log logger = LogFactory.getLog(SaveProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        request.setCharacterEncoding("UTF8");
        response.setCharacterEncoding("UTF8");
        logger.info("17b SaveProductController called");
        ProductForm productForm = new ProductForm();
        // populate action properties
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

        // insert code to save Product

        return new ModelAndView("ProductDetails", "product", product);
    }

}