package io.zwt;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 页码： 10
 * 清单： 1.2
 * 名称： ServletConfigDemoServlet 类
 */

@WebServlet(name = "ServletConfigDemoServlet",
    urlPatterns = {"/servletConfigDemo"},
    initParams = {
        @WebInitParam(name = "admin", value = "Harry Taciak"),
        @WebInitParam(name = "email", value = "admin@example.com")
    }
)
public class ServletConfigDemoServlet implements Servlet {
    private transient ServletConfig servletConfig;

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void init(ServletConfig servletConfig) {
        this.servletConfig = servletConfig;
    }

    @Override
    public void service(ServletRequest request,
                        ServletResponse response)
        throws IOException {
        ServletConfig servletConfig = getServletConfig();
        String admin = servletConfig.getInitParameter("admin");
        String email = servletConfig.getInitParameter("email");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<html><head></head><body>" +
            "Admin:" + admin +
            "<br/>Email:" + email +
            "</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "ServletConfig demo";
    }

    @Override
    public void destroy() {
    }
}
