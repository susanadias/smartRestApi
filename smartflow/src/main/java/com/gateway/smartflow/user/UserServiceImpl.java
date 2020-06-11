package com.gateway.smartflow.user;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Page <User> findUsersByClientId(Long clientId,Pageable pageable) {
		return this.userRepository.findUsersByClientId(clientId, pageable);
	}

	@Override
	public Optional<User> findUserById(Long userId) {
		return this.userRepository.findById(userId);
	}

	
	

}
