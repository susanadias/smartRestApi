package com.gateway.smartflow.utils;

public class requestDto {

    private Long id;

    private String name;

    public requestDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public requestDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
