package com.example.pizzaapp;

public class Video
{

    private String name;
    private String type;
    public Video(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Video() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
