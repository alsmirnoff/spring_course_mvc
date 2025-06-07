package com.learning.spring.mvc;

public enum Departments {
    IT("Information Technology"),
    HR("Human Resources"),
    SALES("Sales");

    private String description;

    Departments(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
