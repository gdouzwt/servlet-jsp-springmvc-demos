package io.zwt.config;

import io.zwt.bean.Address;
import io.zwt.bean.Employee;
import io.zwt.bean.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
public class Config {
    @Bean
    Product product() {
        return new Product();
    }

    @Bean
    Product featuredProduct() {
        return new Product(
            "Ultimate Olive Oil",
            "The purest olive oil on the market",
            9.95F);
    }

    @Bean
    Product featuredProduct2() {
        return new Product(
            "Ultimate Olive Oil",
            "The purest olive oil on the market",
            9.95F);
    }

    @Bean
    Calendar calendar() {
        return Calendar.getInstance();
    }

    @Bean
    Employee employee1() {
        Employee employee = new Employee();
        employee.setHomeAddress(simpleAddress());
        employee.setFirstName("Junior");
        employee.setLastName("Moore");
        return employee;
    }

    @Bean
    Employee employee2() {
        return new Employee(
            "Senior",
            "Moore",
            simpleAddress()
        );
    }


    @Bean
    Address simpleAddress() {
        return new Address(
            "151 Corner Street",
            "",
            "Albany",
            "NY",
            "99999",
            "US"
        );
    }
}
