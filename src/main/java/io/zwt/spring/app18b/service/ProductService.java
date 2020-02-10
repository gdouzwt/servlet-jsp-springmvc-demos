package io.zwt.spring.app18b.service;


import io.zwt.spring.app18b.domain.Product;

public interface ProductService {
    Product add(Product product);

    Product get(long id);
}
