package com.gateway.smartflow.store.dto;

import java.util.Set;
import com.gateway.smartflow.client.dto.ClientDto;
import com.gateway.smartflow.user.User;

public class StoreDto {

	private Long id;

	private String name;
	
	private String email;
	
	private String address;
	
	private int maxAllowed;
	
	private String panelLanguage;
	
	private String logoPath;
	
	private String urlPath;
	
    private ClientDto client;
	
    private Set<User> users;

	public StoreDto() {
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

	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	public ClientDto getClient() {
		return client;
	}

	public void setClient(ClientDto client) {
		this.client = client;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
    
    
	
	


	
	
	
	

	
}
