package com.gateway.smartflow.user.dto;

import org.mapstruct.Mapper;

import com.gateway.smartflow.user.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserDto userToUserDto(User user);

	User userDtoToUser(UserDto userDto);

	UserToStoreDto userToDeviceDto(User user);

	User userToDeviceDtoToUser(UserToStoreDto userToDeviceDto);

}
