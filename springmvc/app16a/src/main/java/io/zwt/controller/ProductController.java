package io.zwt.controller;

import io.zwt.domain.Product;
import io.zwt.form.ProductForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @GetMapping("/product_input.action")
    public String product(Model model) {
        model.addAttribute("product", new ProductForm());
        return "ProductForm";
    }

    @PostMapping("/product_save.action")
    public String details(@ModelAttribute Product details) {
        return "ProductDetails";
    }
}


