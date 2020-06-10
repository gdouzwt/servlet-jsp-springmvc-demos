package io.zwt.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputProductController {

    private static final Log logger = LogFactory
        .getLog(InputProductController.class);

    @GetMapping("/product_input")
    public String productInput() {
        logger.info("InputProductController called");
        return "ProductForm";
    }

}
