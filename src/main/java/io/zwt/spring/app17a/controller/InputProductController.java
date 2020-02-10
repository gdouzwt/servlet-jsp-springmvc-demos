package io.zwt.spring.app17a.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public class InputProductController implements Controller {

    private static final Log logger = LogFactory
            .getLog(InputProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF8");
        response.setCharacterEncoding("UTF8");
        logger.info("InputProductController called");
        return new ModelAndView("/app17a/jsp/ProductForm.jsp");
    }

}
