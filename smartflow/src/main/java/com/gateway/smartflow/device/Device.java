package com.gateway.smartflow.device;

import java.io.Serializable;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gateway.smartflow.client.Client;
import com.gateway.smartflow.store.Store;

@Entity
@Table(name = "device")
public class Device implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "is_panel")
	private boolean isPanel;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "device_ip")
	private String deviceIp;
	
	@Column(name = "mac_address")
	private String macAddress;
	
	@Column(name = "disabled")
	private boolean disabled;
	
	@Column(name = "task_id")
	private Integer taskId;
	
	
	@Column(name = "entry_device")
	private Boolean entryDevice;
	
	@Column(name = "interval_time_notification")
	private String intervalTimeNotification;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;
	
	public Device() {
		
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

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + ", isPanel=" + isPanel + ", description=" + description
				+ ", deviceIp=" + deviceIp + ", macAddress=" + macAddress + ", disabled=" + disabled + ", taskId="
				+ taskId + ", entryDevice=" + entryDevice + ", intervalTimeNotification=" + intervalTimeNotification
				+ ", store=" + store + "]";
	}
	
	
	
	

}
