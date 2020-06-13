package io.zwt.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InputProductController {

    private static final Log logger = LogFactory
        .getLog(InputProductController.class);

    @GetMapping("/product_input.action")
    public ModelAndView handleRequest() {
        logger.debug("InputProductController called");
        return new ModelAndView("/WEB-INF/jsp/ProductForm.jsp");
    }

}
