package com.gateway.smartflow.client.dto;


public class ClientDto {

    private Long id;

    private String name;

    public ClientDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClientDto() {
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