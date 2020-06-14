package com.gateway.smartflow.user.dto;

import java.util.Set;

import com.gateway.smartflow.client.Client;
import com.gateway.smartflow.client.dto.ClientDto;
import com.gateway.smartflow.role.Role;
import com.gateway.smartflow.store.Store;
import com.gateway.smartflow.store.dto.StoreDto;
import com.gateway.smartflow.utils.RequestDto;

public class UserDto {
    private Long id;

    private String name;

    private String email;

    private String userPassword;

    private boolean disabled;

    private RequestDto role;
    
    private ClientDto client;
    
    private Set<StoreDto> stores;

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

	public RequestDto getRole() {
        return role;
    }

    public void setRole(RequestDto role) {
       this.role = role;
    }
    
    public ClientDto getClient() {
        return client;
    }

    public void setClient (ClientDto client) {
      this.client = client;
    }

	public Set<StoreDto> getStores() {
		return stores;
	}

	public void setStores(Set<StoreDto> store) {
		this.stores=store;
	}
    
  
    
}
