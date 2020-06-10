package com.gateway.smartflow.zone;

import java.io.Serializable;
import javax.persistence.*;

import com.gateway.smartflow.device.Device;

@Entity
@Table(name = "zone")
public class Zone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", unique = true)
	private String name;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "device_id", nullable = false)
	private Device device;

	public Zone() {

	}
}