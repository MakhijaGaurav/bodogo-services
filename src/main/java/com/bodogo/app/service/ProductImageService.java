package com.bodogo.app.service;

import com.bodogo.app.model.ProductImage;
import com.bodogo.app.repository.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductImageService {

    @Autowired
    private ProductImageRepository repository;

    public ProductImage saveProductImage(ProductImage productImage){
        return repository.save(productImage);
    }
}
