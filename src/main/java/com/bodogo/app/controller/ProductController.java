package com.bodogo.app.controller;


import com.bodogo.app.model.Product;
import com.bodogo.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
}
