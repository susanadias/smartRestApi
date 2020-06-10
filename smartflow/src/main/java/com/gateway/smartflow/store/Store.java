package com.gateway.smartflow.store;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Size;

import com.gateway.smartflow.client.Client;
import com.gateway.smartflow.plan.Plan;
import com.gateway.smartflow.user.User;

@Entity
@Table(name = "store")
public class Store implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Size(max = 255)
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	

	@Column(name = "address")
	private String address;
	
	@Column(name = "max_allowed")
	private int maxAllowed;
	
	@Column(name = "panel_language")
	private String panelLanguage;
	
	@Column(name = "logo_path")
	private String logoPath;
	
	@Column(name = "url_path")
	private String urlPath;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
	
	@ManyToMany(mappedBy = "stores")
    private Set<User> users;

	
	public Store() {
		
	}
	

}
