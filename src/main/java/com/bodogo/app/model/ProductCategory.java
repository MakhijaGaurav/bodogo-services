package com.bodogo.app.model;

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

public class ProductCategory {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int id;
    private String name;

    @CreationTimestamp
    @Column(nullable = false,columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createdAt = new Date();

    @UpdateTimestamp
    @Column(nullable = false,columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date updatedAt = new Date();

    @Column(nullable = false,columnDefinition = "int default 0")
    private int deleted=0;

}
