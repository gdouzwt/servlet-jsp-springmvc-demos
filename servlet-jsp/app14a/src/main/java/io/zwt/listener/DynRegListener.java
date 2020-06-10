package io.zwt.listener;

import io.zwt.servlet.FirstServlet;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class DynRegListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    // use createServlet to obtain a Servlet instance that can be
    // configured prior to being added to ServletContext
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();

        Servlet firstServlet = null;
        try {
            firstServlet =
                servletContext.createServlet(FirstServlet.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (firstServlet != null && firstServlet instanceof
            FirstServlet) {
            ((FirstServlet) firstServlet).setName(
                "Dynamically registered servlet");
        }

        // the servlet may not be annotated with @WebServlet
        ServletRegistration.Dynamic dynamic = servletContext.
            addServlet("firstServlet", firstServlet);
        dynamic.addMapping("/dynamic");
    }
}
