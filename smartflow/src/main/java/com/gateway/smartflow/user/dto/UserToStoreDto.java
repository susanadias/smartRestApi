package com.gateway.smartflow.user.dto;

import java.util.Set;

import com.gateway.smartflow.role.RoleDto;
import com.gateway.smartflow.store.dto.StoreDto;
import com.gateway.smartflow.store.dto.StoreToDeviceDto;
import com.gateway.smartflow.utils.RequestDto;

public class UserToStoreDto {
	
	private Long id;

    private String name;
    
    private Set<StoreToDeviceDto> stores;

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

	public Set<StoreToDeviceDto> getStores() {
		return stores;
	}

	public void setStores(Set<StoreToDeviceDto> stores) {
		this.stores = stores;
	}
    
    


}
