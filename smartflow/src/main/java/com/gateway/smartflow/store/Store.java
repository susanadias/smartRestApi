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
	
	@Column(name = "panel_url")
	private String panelUrl;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
	
	@ManyToMany(mappedBy = "stores")
    private Set<User> users;

	
	public Store() {
		
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getMaxAllowed() {
		return maxAllowed;
	}


	public void setMaxAllowed(int maxAllowed) {
		this.maxAllowed = maxAllowed;
	}


	public String getPanelLanguage() {
		return panelLanguage;
	}


	public void setPanelLanguage(String panelLanguage) {
		this.panelLanguage = panelLanguage;
	}


	public String getLogoPath() {
		return logoPath;
	}


	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}


	

	public String getPanelUrl() {
		return panelUrl;
	}


	public void setPanelUrl(String panelUrl) {
		this.panelUrl = panelUrl;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Set<User> getUsers() {
		return users;
	}


	public void setUsers(Set<User> users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", maxAllowed="
				+ maxAllowed + ", panelLanguage=" + panelLanguage + ", logoPath=" + logoPath + ", panelUrl=" + panelUrl
				+ ", client=" + client + ", users=" + users + "]";
	}


	
	
	
	

}
