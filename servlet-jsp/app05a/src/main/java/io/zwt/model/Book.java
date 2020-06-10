package io.zwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String isbn;
    private String title;
    private double price;
}
