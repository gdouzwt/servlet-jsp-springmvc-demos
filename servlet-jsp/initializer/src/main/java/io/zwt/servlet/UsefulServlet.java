package io.zwt.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UsefulServlet extends HttpServlet {
    private static final long serialVersionUID = -6045338L;

    private String name;

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><head><title>First servlet" +
            "</title></head><body>" + name);
        writer.println("</body></head>");
    }

    public void setName(String name) {
        this.name = name;
    }
}
