package com.bodogo.app.controller;

import com.bodogo.app.model.ProductSubCategory;
import com.bodogo.app.service.ProductSubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductSubCategoryController {

    @Autowired
    private ProductSubCategoryService service;

    @PostMapping("/product/subcategory")
    public ProductSubCategory addProductSubCategory(@RequestBody ProductSubCategory productSubCategory){
        System.out.println(productSubCategory);
        return service.saveProductSubCategory(productSubCategory);
    }
}
