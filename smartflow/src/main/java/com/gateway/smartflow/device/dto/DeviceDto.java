package com.gateway.smartflow.device.dto;

import com.gateway.smartflow.store.dto.StoreDto;

public class DeviceDto {
	
	private Long id;

	private String name;

	private boolean isPanel;
	
	private String description;

	private String deviceIp;
	
	private String macAddress;
	
	private boolean disabled;
	
	private Integer taskId;
	
	private Boolean entryDevice;

	private String intervalTimeNotification;
	
    private StoreDto store;
    

	public DeviceDto() {
		super();
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

	public boolean isPanel() {
		return isPanel;
	}

	public void setPanel(boolean isPanel) {
		this.isPanel = isPanel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Boolean isEntryDevice() {
		return entryDevice;
	}

	public void setEntryDevice(Boolean entryDevice) {
		this.entryDevice = entryDevice;
	}

	public String getIntervalTimeNotification() {
		return intervalTimeNotification;
	}

	public void setIntervalTimeNotification(String intervalTimeNotification) {
		this.intervalTimeNotification = intervalTimeNotification;
	}

	public StoreDto getStore() {
		return store;
	}

	public void setStore(StoreDto store) {
		this.store = store;
	}
    
    
	

}
