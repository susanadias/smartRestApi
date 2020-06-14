package com.gateway.smartflow.client;

import com.gateway.smartflow.client.dto.ClientDto;


public interface ClientService {
	
	ClientDto findDeviceById(Long clientId);

	Client createClient(ClientDto clientDto);

	Client editClient(Long clientId, ClientDto clientDto);

	void deleteClient(Long clientId);

}
