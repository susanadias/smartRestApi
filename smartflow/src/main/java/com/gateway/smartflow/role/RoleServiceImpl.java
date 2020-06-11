package com.gateway.smartflow.role;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {
	
	private static final Logger logger = LogManager.getLogger(RoleServiceImpl.class);
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Role> findAll() {
		
		return (List<Role>)this.roleRepository.findAll();
	
	}

}
