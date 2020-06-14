package com.gateway.smartflow.device;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/devices")
public class DeviceController {
	
	private static final Logger logger = LogManager.getLogger(DeviceController.class);
	   
	@Autowired
    private DeviceService deviceService;

}
