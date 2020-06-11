package com.gateway.smartflow.module;

import java.util.Set;

import javax.persistence.*;

import com.gateway.smartflow.plan.Plan;

@Entity
@Table(name = "module")
public class Module {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", unique = true)
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "plan_has_modules", joinColumns = @JoinColumn(name = "module_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "plan_id", referencedColumnName = "id"))
	private Set<Plan> plans;

	public Module() {

	}

}
