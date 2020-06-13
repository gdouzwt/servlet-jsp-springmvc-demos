package io.zwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * 这个类代替 web.xml 文件的作用，动态注册 DispatcherServlet
 */
@SpringBootApplication
public class App17a implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(App17a.class);

        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher",
            new DispatcherServlet(context));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }

    public static void main(String[] args) {
        SpringApplication.run(App17a.class, args);
    }
}
