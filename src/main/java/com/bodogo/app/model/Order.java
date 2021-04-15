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
@Table(name = " \"orders\" ")
public class Order {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @CreationTimestamp
    @Column(nullable = false,columnDefinition = "timestamp with time zone default CURRENT_TIMESTAMP")
    private Date date;

    @JsonProperty("user_id")
    @Column(name = " \"user_id\" ")
    private int user;

    private String status;

    @Column(columnDefinition = "text")
    private String message;

    @Column(nullable = false)
    private String phone;

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
