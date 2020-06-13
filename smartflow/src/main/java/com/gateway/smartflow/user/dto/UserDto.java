package com.gateway.smartflow.user.dto;

import com.gateway.smartflow.client.Client;
import com.gateway.smartflow.role.Role;
import com.gateway.smartflow.utils.requestDto;

public class UserDto {
    private Long id;

    private String name;

    private String email;

    private String userPassword;

    private boolean disabled;

    private requestDto role;
    
    private requestDto client;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public requestDto getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = new requestDto(role.getId(), role.getName());
    }
    
    public requestDto getClient() {
        return client;
    }

    public void setClient (Client client) {
        this.client = new requestDto(client.getId(), client.getName());
    }
    

    

    
}
