package io.zwt.spring.app18a.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 5784L;
    private long id;
    private String name;
    private String description;
    private float price;

}