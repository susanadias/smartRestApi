package com.gateway.smartflow.module;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.gateway.smartflow.plan.Plan;

@Entity
@Table(name = "module")
public class Module {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", unique = true)
	private String name;
	
	@ManyToMany(mappedBy = "modules")
    private Set<Plan> plans;
	
	public Module () {
		
		
	}
	
	
	

}
