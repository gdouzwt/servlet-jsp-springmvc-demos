package io.zwt.app01a;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 页码： 5
 * 清单： 1.1
 * 名称： MyServlet 类
 */

// 注解提供该Servlet的信息，名称，url路径
@WebServlet(name = "MyServlet", urlPatterns = {"/my"})
public class MyServlet implements Servlet {

    private transient ServletConfig servletConfig;


    // 生命周期方法。初始化时候调用这个方法，只会执行一次，传入参数为该Servlet的配置信息
    @Override
    public void init(ServletConfig servletConfig) {
        this.servletConfig = servletConfig;
    }


    // 普通用途，获取该Servlet的配置信息
    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    // 这个方法是主要干活的方法，传入参数是 @ServletRequest 和 @ServletResponse 表示请求和响应
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
        throws IOException {
        String servletName = servletConfig.getServletName();
        servletResponse.setContentType("text/html");
        servletResponse.setCharacterEncoding("UTF-8");
        PrintWriter writer = servletResponse.getWriter();
        writer.print("<html><head></head>" +
            "<body>Hello from " + servletName +
            "</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "My Servlet";
    }

    @Override
    public void destroy() {
        System.out.println("I'm dying!");
    }
}
