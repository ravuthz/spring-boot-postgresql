package com.springboot.tutorial.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Category {
    private long id;
    private String name;
}
