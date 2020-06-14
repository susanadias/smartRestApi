package com.gateway.smartflow.device;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gateway.smartflow.device.dto.DeviceDto;

public interface DeviceService {

	Page<DeviceDto> findDeviceByStoreId(String storeId, Pageable pageable);

	DeviceDto findDeviceById(Long deviceId);

	Device createDevice(DeviceDto deviceDto);

	Device editDevice(Long deviceId, DeviceDto deviceDto);

	void deleteDevice(Long deviceId);

}
