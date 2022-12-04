package com.etiya.ecommercedemo3.business.abstracts;

import com.etiya.ecommercedemo3.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(int id);
}
