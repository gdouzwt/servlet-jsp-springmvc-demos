package io.zwt.servlet.app12d;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/servlet4"})
@ServletSecurity(@HttpConstraint(rolesAllowed = "manager"))
public class Servlet4 extends HttpServlet {

    private static final long serialVersionUID = -11420L;

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
        IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/app12d/jsp/1.jsp");
        dispatcher.forward(request, response);
    }
}
