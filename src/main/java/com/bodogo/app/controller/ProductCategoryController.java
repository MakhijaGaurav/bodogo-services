package com.bodogo.app.controller;

import com.bodogo.app.model.ProductCategory;
import com.bodogo.app.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService service;

    @PostMapping("/product/category")
    public ProductCategory addProductCategory(@RequestBody ProductCategory productCategory){
        return service.saveProductCategory(productCategory);
    }
}
