package io.zwt.controller;

import io.zwt.domain.Product;
import io.zwt.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SaveProductController {

    private static final Log logger = LogFactory
        .getLog(SaveProductController.class);


    public ModelAndView saveProduct(HttpServletRequest request,
                                    HttpServletResponse response) {
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

        return new ModelAndView("public/jsp/ProductDetails.jsp", "product",
            product);
    }

}
