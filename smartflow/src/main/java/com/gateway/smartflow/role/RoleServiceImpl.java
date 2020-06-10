package com.gateway.smartflow.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Role> findAll() {
		
		return (List<Role>)this.roleRepository.findAll();
	
	}

}
