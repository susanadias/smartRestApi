package com.gateway.smartflow.user.dto;

import java.util.Set;

import com.gateway.smartflow.client.Client;
import com.gateway.smartflow.client.dto.ClientDto;
import com.gateway.smartflow.role.Role;
import com.gateway.smartflow.role.RoleDto;
import com.gateway.smartflow.store.Store;
import com.gateway.smartflow.store.dto.StoreDto;
import com.gateway.smartflow.utils.RequestDto;

public class UserDto {
    private Long id;

    private String name;

    private String email;

    private String password;

    private boolean disabled;

    private RoleDto role;
    
    private RequestDto client;
    
    private Set<RequestDto> stores;

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

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	
    
    public RoleDto getRole() {
		return role;
	}

	public void setRole(RoleDto role) {
		this.role = role;
	}

	public RequestDto getClient() {
		return client;
	}

	public void setClient(RequestDto client) {
		this.client = client;
	}

	public Set<RequestDto> getStores() {
		return stores;
	}

	public void setStores(Set<RequestDto> stores) {
		this.stores = stores;
	}

	
  
    
}
