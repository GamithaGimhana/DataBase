package com.ijse.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Item {
    
    @Column(unique = true)
    private String name;

    private Double price;

    private Integer Qty;
}
