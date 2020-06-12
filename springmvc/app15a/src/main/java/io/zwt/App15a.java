package io.zwt;

import io.zwt.bean.Employee;
import io.zwt.bean.Product;
import io.zwt.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;

public class App15a {
    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);

        ApplicationContext context =
            new AnnotationConfigApplicationContext(Config.class);
        Product product1 = context.getBean("product", Product.class);
        product1.setName("Excellent snake oil");
        System.out.println("product1: " + product1.getName());

        Product product2 = context.getBean("product", Product.class);
        System.out.println("product2: " + product2.getName());

        Product featuredProduct = context.getBean("featuredProduct", Product.class);
        System.out.println(featuredProduct.getName() + ", " + featuredProduct.getDescription()
            + ", " + featuredProduct.getPrice());

        Calendar calendar = context.getBean("calendar", Calendar.class);
        System.out.println(calendar.getTime());

        Employee employee1 = context.getBean("employee1", Employee.class);
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println(employee1.getHomeAddress());

        Employee employee2 = context.getBean("employee2", Employee.class);
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println(employee2.getHomeAddress());
    }

}
