package com.bodogo.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table

public class ProductSubCategory {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "category",nullable = false)
    @JsonProperty("product_category")
    private ProductCategory productCategory;

    private String name;

    @CreationTimestamp
    @Column(nullable = false,columnDefinition = "timestamp with time zone default CURRENT_TIMESTAMP")
    private Date createdAt = new Date();

    @UpdateTimestamp
    @Column(nullable = false,columnDefinition = "timestamp with time zone default CURRENT_TIMESTAMP")
    private Date updatedAt = new Date();

    @Column(nullable = false,columnDefinition = "int default 0")
    private int createdBy;

    @Column(nullable = false,columnDefinition = "int default 0")
    private int updatedBy;

    @Column(nullable = false,columnDefinition = "int default 0")
    private int deleted=0;




}
