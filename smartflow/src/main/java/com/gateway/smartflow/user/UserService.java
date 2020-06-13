package com.gateway.smartflow.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.gateway.smartflow.user.dto.UserDto;

public interface UserService {
	
	Page<User> findUsersByClientId(Long clientId,Pageable pageable);
	
	UserDto findUserById(Long userId);
	
	Page<UserDto> findUsersByClientIdTest(String clientId, Pageable pageable);
	
	User saveUser(UserDto userDto);
	
	User editUser(Long userId, UserDto userDto);
	
	void deleteUser(Long userId);
               
}
