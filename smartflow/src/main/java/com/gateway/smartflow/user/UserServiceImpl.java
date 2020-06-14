package com.gateway.smartflow.user;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gateway.smartflow.user.dto.UserMapper;
import com.gateway.smartflow.user.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
	
    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;
	

	@Override
	public Page<User> findUsersByClientId(Long clientId, Pageable pageable) {
		return this.userRepository.findUsersByClientId(clientId, pageable);
	}

	@Override
	public Page<UserDto> findUsersByClientIdTest(String clientId, Pageable pageable) {
		Page<User> page = this.userRepository.findUsersByClientIdTeste(Long.valueOf(clientId), pageable);

		List<UserDto> userResponse = page.getContent().stream().map(userMapper::userToUserDto)
				.collect(Collectors.toList());

		return new PageImpl<>(userResponse, pageable, page.getTotalElements());
	}
	
	@Override
	public UserDto findUserById(Long userId) {
		UserDto userDto = new UserDto();
		Optional<User> user=this.userRepository.findById(userId);
		
		if(user.isPresent()) {
			userDto=this.userMapper.userToUserDto(user.get());
		}
		
		return userDto;
	}

	@Override
	public User saveUser(UserDto userDto) {
		return this.userRepository.save(this.userMapper.userDtoToUser(userDto));
	}

	@Override
	public void deleteUser(Long userId) {
	    this.deleteUser(userId);
		
	}

	@Override
	public User editUser(Long userId, UserDto userDto) {
		User user= this.userMapper.userDtoToUser(userDto);
		user.setId(userId);
		return this.userRepository.save(user);
	}
	
	

}
