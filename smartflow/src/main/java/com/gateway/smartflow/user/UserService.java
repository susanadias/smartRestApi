package com.gateway.smartflow.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gateway.smartflow.user.dto.UserDto;
import com.gateway.smartflow.user.dto.UserToStoreDto;


public interface UserService {
	
	Page<User> findUsersByClientId(Long clientId,Pageable pageable);
	
	UserDto findUserById(Long userId);
	
	Page<UserDto> findUsersByClientIdTest(String clientId, Pageable pageable);
	
	User createUser(UserDto userDto);
	
	User editUser(Long userId, UserDto userDto);
	
	void deleteUser(Long userId);
	
	UserToStoreDto findStoresByUserId(Long userId);
               
}
