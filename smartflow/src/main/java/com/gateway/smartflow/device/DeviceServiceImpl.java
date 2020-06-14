package com.gateway.smartflow.device;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl implements DeviceService{
private static final Logger logger = LogManager.getLogger(DeviceServiceImpl.class);
	
	@Autowired
	private DeviceRepository deviceRepository;
	
}
