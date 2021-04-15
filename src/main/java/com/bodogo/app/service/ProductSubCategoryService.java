package com.bodogo.app.service;

import com.bodogo.app.model.ProductSubCategory;
import com.bodogo.app.repository.ProductSubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductSubCategoryService {

    @Autowired
    private ProductSubCategoryRepository repository;

    public ProductSubCategory saveProductSubCategory(ProductSubCategory productSubCategory){
        return repository.save(productSubCategory);
    }
}
