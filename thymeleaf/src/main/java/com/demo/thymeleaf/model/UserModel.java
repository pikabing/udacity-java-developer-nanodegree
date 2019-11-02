package com.demo.thymeleaf.model;

import javax.validation.constraints.NotBlank;

public class UserModel {

    @NotBlank(message = "age cannot be empty")
    private String id;
    @NotBlank(message = "name cannot be empty")
    private String name;
    private Integer age;
 
    public UserModel(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


 }