package com.gateway.smartflow.role;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gateway.smartflow.user.User;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", unique = true)
	private String name;

	@JsonIgnore
	@OneToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<User> users;

	public Role() {
	}

	public Role(String name) {
		this.name = name;
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Role{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", users=").append(users);
		sb.append('}');
		return sb.toString();
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    

}