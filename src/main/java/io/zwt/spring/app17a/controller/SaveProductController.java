package io.zwt.spring.app17a.controller;

import io.zwt.spring.app17a.domain.Product;
import io.zwt.spring.app17a.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;


public class SaveProductController implements Controller {

    private static final Log logger = LogFactory
        .getLog(SaveProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF8");
        response.setCharacterEncoding("UTF8");
        logger.info("SaveProductController called");
        ProductForm productForm = new ProductForm();
        // populate action properties
        productForm.setName(request.getParameter("name"));
        productForm.setDescription(request.getParameter("description"));
        productForm.setPrice(request.getParameter("price"));

        // create model
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        } catch (NumberFormatException ignored) {
        }

        // insert code to save Product

        return new ModelAndView("/app17a/jsp/ProductDetails.jsp", "product",
            product);
    }

}
