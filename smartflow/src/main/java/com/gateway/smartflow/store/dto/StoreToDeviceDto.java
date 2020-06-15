package com.gateway.smartflow.store.dto;

import java.util.Set;

import com.gateway.smartflow.device.Device;
import com.gateway.smartflow.device.dto.DeviceDto;

public class StoreToDeviceDto {
	
	private Long id;

	private String name;
	
	private String address;
	
	Set<DeviceDto> devices;

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
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<DeviceDto> getDevices() {
		return devices;
	}

	public void setDevices(Set<DeviceDto> devices) {
		this.devices = devices;
	}
	
}
