package com.gateway.smartflow.client;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.gateway.smartflow.plan.Plan;
import com.gateway.smartflow.user.User;

@Entity
@Table(name = "client")
public class Client implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "disabled")
	private boolean disabled;

	@Column(name = "show_gateway_logo")
	private String showGatewayLogo;
	
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<User> users;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "plan_id", nullable = false)
    private Plan plan;
	
	public Client() {
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isDisabled() {
		return disabled;
	}



	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}



	public String getShowGatewayLogo() {
		return showGatewayLogo;
	}



	public void setShowGatewayLogo(String showGatewayLogo) {
		this.showGatewayLogo = showGatewayLogo;
	}



	public Set<User> getUsers() {
		return users;
	}



	public void setUsers(Set<User> users) {
		this.users = users;
	}



	public Plan getPlan() {
		return plan;
	}



	public void setPlan(Plan plan) {
		this.plan = plan;
	}



	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", disabled=" + disabled + ", showGatewayLogo=" + showGatewayLogo
				+ ", users=" + users + ", plan=" + plan + "]";
	}
	
	
	
	

	
	
	
	
	
	

}
