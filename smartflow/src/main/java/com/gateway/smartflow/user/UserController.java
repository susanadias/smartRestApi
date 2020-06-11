package com.gateway.smartflow.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/v1/users")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
    public ResponseEntity<Page<User>> getAllUsersByClientId(UserFilter userFilter) 
    {	
		//TODO 
		
		Pageable pageable = PageRequest.of(userFilter.getPageNumber(),userFilter.getPageSize());
		
		Page<User> list = this.userService.findUsersByClientId(Long.valueOf(userFilter.getClientId()), pageable);
		
	    return new ResponseEntity<Page<User>>(list, new HttpHeaders(), HttpStatus.OK);
    }

	@GetMapping("/{userId}")
    public ResponseEntity<List<User>> getUserById(@PathVariable("userId") int userId) 
    {	
		
		return null;
		
	    //return new ResponseEntity<List<User>>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
