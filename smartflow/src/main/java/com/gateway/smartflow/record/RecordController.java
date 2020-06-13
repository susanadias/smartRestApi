package com.gateway.smartflow.record;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


public class RecordController {
	
	private static final Logger logger = LogManager.getLogger(RecordController.class);
	   
	@Autowired
    private RecordService recordService;

}
