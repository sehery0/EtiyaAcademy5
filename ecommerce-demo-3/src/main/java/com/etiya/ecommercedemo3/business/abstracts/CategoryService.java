package com.etiya.ecommercedemo3.business.abstracts;

import com.etiya.ecommercedemo3.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
    Category getById(int id);
}
