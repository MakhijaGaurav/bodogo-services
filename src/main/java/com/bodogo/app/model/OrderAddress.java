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
public class OrderAddress {
    @Id
    @GeneratedValue
    private int id;

    @JsonProperty("order_id")
    @Column(nullable = false,name="order_id")
    private int orderID;

    private String type;

    @JsonProperty("address_line_1")
    @Column(name="address_line_1")
    private String addressLine_1;

    @JsonProperty("address_line_2")
    @Column(name="address_line_2")
    private String addressLine_2;

    private String landmark;

    private String city;

    private String State;

    private String country;

    @JsonProperty("pin_code")
    @Column(name="pin_code")
    private int pinCode;

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
