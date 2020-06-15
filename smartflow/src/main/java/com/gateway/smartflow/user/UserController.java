package com.gateway.smartflow.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.constraints.Min;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gateway.smartflow.user.dto.UserDto;
import com.gateway.smartflow.user.dto.UserToStoreDto;




@RequestMapping("/api/v1/users")
@RestController
public class UserController {
	
	private static final Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
    public  ResponseEntity<Map<String, Object>> getUsersByClientId(@RequestParam(defaultValue = "0") @Min(0) int page,
            @RequestParam(defaultValue = "10") @Min(1) int size,
            @RequestParam String clientId) {
		
		logger.info("Get user by client Id");
		
		try {

			Pageable pageable = PageRequest.of(page, size);
			Page<UserDto> usersPage = this.userService.findUsersByClientIdTest(clientId, pageable);
			
			Map<String, Object> userResponse = new HashMap<>();
			userResponse.put("users", usersPage.getContent());
			userResponse.put("currentPage", usersPage.getNumber());
			userResponse.put("totalItems", usersPage.getTotalElements());
			userResponse.put("totalPages", usersPage.getTotalPages());

			return new ResponseEntity(userResponse, new HttpHeaders(), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
        
    }
	

	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("userId") String userId) {
		logger.info("Get user by Id");
		UserDto user = this.userService.findUserById(Long.valueOf(userId));
		return new ResponseEntity<UserDto>(user, new HttpHeaders(), HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody UserDto userDto) {
		logger.info("Create a new user");
		User user = this.userService.createUser(userDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
	
	@PutMapping("/{userId}")
    public ResponseEntity<UserDto> update(@PathVariable("userId") String userId, @RequestBody UserDto userDto) {
		logger.info("Edit user");
		this.userService.editUser(Long.valueOf(userId), userDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userDto);
    }
	
	
	@GetMapping("/{userId}/stores")
	public ResponseEntity<UserToStoreDto> getStoresByUserId(@PathVariable("userId") String userId) {
		logger.info("Get Stores by user Id");
		UserToStoreDto userToDeviceDto=this.userService.findStoresByUserId(Long.valueOf(userId));
		return new ResponseEntity<UserToStoreDto>(userToDeviceDto, new HttpHeaders(), HttpStatus.OK);
	}
	
	

}
