package com.gateway.smartflow.classification;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "classification")
public class Classification implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "type", unique = true)
	private String type;
	
	public Classification() {
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Classification [id=" + id + ", type=" + type + "]";
	}
	
	

}
