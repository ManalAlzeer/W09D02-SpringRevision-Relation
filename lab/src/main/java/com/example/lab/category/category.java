package com.example.lab.category;

import javax.persistence.*;


@Entity
@Table(name = "category")
public class category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public category(){}

    public category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
