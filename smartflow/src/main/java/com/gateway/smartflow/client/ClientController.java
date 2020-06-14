package com.gateway.smartflow.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

	private static final Logger logger = LogManager.getLogger(ClientController.class);
	   
	@Autowired
    private ClientService clientService;
}
