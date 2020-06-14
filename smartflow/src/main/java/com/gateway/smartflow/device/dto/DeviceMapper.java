package com.gateway.smartflow.device.dto;

import org.mapstruct.Mapper;

import com.gateway.smartflow.device.Device;

@Mapper(componentModel = "spring")
public interface DeviceMapper {
	
	DeviceDto deviceToDeviceDto(Device device);
    
    Device deviceDtoToDevice (DeviceDto deviceDto);

}
