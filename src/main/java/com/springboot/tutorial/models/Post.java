package com.springboot.tutorial.models;

// Model

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Setter
    @Getter
    private long id;

    @Getter
    @Setter
    private String name;

//    public Post() {
//        System.out.println("Default Constructor");
//    }

    public Post(String name) {
        System.out.println("Argument Constructor");
        this.name = name;
    }

//    public Post(long id, String name) {
//        this.id = id;
//        this.name = name;
//    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

//    public String getName() {
//        return name;

//    }

//    public void setName(String name) {
//        this.name = name;
//    }


    @Override
    public String toString() {
        return "Post(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ')';
    }
}