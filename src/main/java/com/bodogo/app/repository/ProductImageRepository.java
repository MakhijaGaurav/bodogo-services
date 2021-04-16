package com.bodogo.app.repository;

import com.bodogo.app.model.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage,Integer> {
}
