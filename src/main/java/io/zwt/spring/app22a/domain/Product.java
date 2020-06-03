package io.zwt.spring.app22a.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 78L;

    @NotNull
    @Size(min = 1, max = 10)
    private String name;

    private String description;
    private Float price;
}