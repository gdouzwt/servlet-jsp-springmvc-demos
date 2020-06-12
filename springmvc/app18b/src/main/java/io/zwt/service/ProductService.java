package io.zwt.service;

import io.zwt.domain.Product;

public interface ProductService {
    Product add(Product product);

    Product get(long id);
}
