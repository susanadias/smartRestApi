package com.gateway.smartflow.device;

import java.io.Serializable;


import javax.persistence.*;

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
	private int taskId;
	
	@Column(name = "entry_device")
	private boolean entryDevice;
	
	@Column(name = "interval_time_notification")
	private String intervalTimeNotification;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;
	
	public Device() {
		
	}
	
	

}
