package com.ijse.database.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.database.entity.Category;

@Service
public interface CategoryService {
    
    Category createCategory(Category category);     //create category method
    Category getCategoryById(Long id);      //read category by user_id
    List<Category> getAllCategories();       //read all Categories
    Category updateCategory(Long id, Category category);
}
