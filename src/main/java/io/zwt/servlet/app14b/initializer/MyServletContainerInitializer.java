package io.zwt.servlet.app14b.initializer;

import io.zwt.servlet.app14b.servlet.UsefulServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes({UsefulServlet.class})
public class MyServletContainerInitializer implements
        ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> classes, ServletContext
            servletContext) {

        System.out.println("onStartup");
        ServletRegistration registration =
                servletContext.addServlet("usefulServlet",
                        "io.zwt.servlet.app14b.servlet.UsefulServlet");
        registration.addMapping("/useful");
        System.out.println("leaving onStartup");
    }
}