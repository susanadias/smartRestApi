package com.gateway.smartflow.store;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stores")
public class StoreController {
	
	private static final Logger logger = LogManager.getLogger(StoreController.class);
	   
	@Autowired
    private StoreService storeService;

}
