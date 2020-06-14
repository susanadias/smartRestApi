package com.gateway.smartflow.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientServiceImpl implements ClientService{
	
private static final Logger logger = LogManager.getLogger(ClientServiceImpl.class);
	
	@Autowired
	private ClientRepository clientRepository;

}
