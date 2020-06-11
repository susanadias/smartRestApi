package com.gateway.smartflow.user;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
	Page<User> findUsersByClientId(Long clientId,Pageable pageable);
	
	Optional<User> findUserById(Long userId);
}
