package io.zwt.model;

import lombok.Data;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@Data
public class Product implements HttpSessionBindingListener {
    private String id;
    private String name;
    private double price;

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        String attributeName = event.getName();
        System.out.println(attributeName + " valueBound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        String attributeName = event.getName();
        System.out.println(attributeName + " valueUnbound");
    }
}
