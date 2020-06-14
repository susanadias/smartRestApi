package com.gateway.smartflow.utils;

public class RequestDto {

    private Long id;

    private String name;
    
    private String label;

    public RequestDto(Long id, String name, String label) {
        this.id = id;
        this.name = name;
        this.label = label;
    }

    public RequestDto() {
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
    
    

}
