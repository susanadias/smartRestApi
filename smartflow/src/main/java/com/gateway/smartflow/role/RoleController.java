package com.gateway.smartflow.role;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {
	
	private static final Logger logger = LogManager.getLogger(RoleController.class);
   
	@Autowired
    private RoleService roleService;

    @GetMapping
    public ResponseEntity<List<Role>> getAllRoles(){
    	List<Role> roles = this.roleService.findAll();
        return ResponseEntity.ok(roles); 
    }
}
