package io.zwt.spring.app16b.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request,
                                HttpServletResponse response) {
        return "/app16b/jsp/ProductForm.jsp";
    }
}
