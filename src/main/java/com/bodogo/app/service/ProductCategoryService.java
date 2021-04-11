package com.bodogo.app.service;

import com.bodogo.app.model.ProductCategory;
import com.bodogo.app.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryService {
    @Autowired
    private ProductCategoryRepository respository;

    public ProductCategory saveProductCategory(ProductCategory productCategory){
        return respository.save(productCategory);
    }
}
