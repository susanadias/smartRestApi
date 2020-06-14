package com.gateway.smartflow.device;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gateway.smartflow.device.dto.DeviceDto;
import com.gateway.smartflow.device.dto.DeviceMapper;
import com.gateway.smartflow.exceptions.ResourceNotFoundException;
import com.gateway.smartflow.store.Store;
import com.gateway.smartflow.user.User;
import com.gateway.smartflow.user.dto.UserDto;

@Service
public class DeviceServiceImpl implements DeviceService{
private static final Logger logger = LogManager.getLogger(DeviceServiceImpl.class);
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Autowired
	private DeviceMapper deviceMapper;

	@Override
	public Page<DeviceDto> findDeviceByStoreId(String storeId, Pageable pageable) {
		
		Page<Device> page = this.deviceRepository.findDevicesByStoreId(Long.valueOf(storeId), pageable);

		List<DeviceDto> deviceList = page.getContent().stream().map(deviceMapper::deviceToDeviceDto)
				.collect(Collectors.toList());

		return new PageImpl<>(deviceList, pageable, page.getTotalElements());
	}

	@Override
	public DeviceDto findDeviceById(Long deviceId) {
		return this.deviceMapper.deviceToDeviceDto(
				this.deviceRepository.findById(deviceId).orElseThrow(() -> new RuntimeException(" Device Unavailable")));
	}

	@Override
	public Device createDevice(DeviceDto deviceDto) {
		return this.deviceRepository.save(this.deviceMapper.deviceDtoToDevice(deviceDto));
	}

	@Override
	public Device editDevice(Long deviceId, DeviceDto deviceDto) {
		Device device= this.deviceMapper.deviceDtoToDevice(deviceDto);
		device.setId(deviceId);
		return this.deviceRepository.save(device);
	}

	@Override
	public void deleteDevice(Long deviceId) {
		Optional<Device> hasDevice = this.deviceRepository.findById(deviceId);

		if (hasDevice.isPresent()) {
			this.deviceRepository.delete(hasDevice.get());
		} else {
			throw new ResourceNotFoundException("Device not found with id : " + deviceId);
		}
	}
	
}
