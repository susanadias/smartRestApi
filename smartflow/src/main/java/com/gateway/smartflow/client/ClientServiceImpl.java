package com.gateway.smartflow.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gateway.smartflow.client.dto.ClientDto;


@Service
public class ClientServiceImpl implements ClientService{
	
private static final Logger logger = LogManager.getLogger(ClientServiceImpl.class);
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public ClientDto findDeviceById(Long clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client createClient(ClientDto clientDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client editClient(Long clientId, ClientDto clientDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteClient(Long clientId) {
		// TODO Auto-generated method stub
		
	}

}
