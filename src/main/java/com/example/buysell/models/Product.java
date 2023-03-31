package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;
    private Long id;
}
