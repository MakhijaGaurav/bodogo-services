package com.bodogo.app.controller;

import com.bodogo.app.model.ProductImage;
import com.bodogo.app.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductImageController {
    @Autowired
    private ProductImageService service;

    @PostMapping("/product/image")
    public ProductImage addProductImage(@RequestBody ProductImage productImage){
        return service.saveProductImage(productImage);
    }
}
