package com.gateway.smartflow.client.dto;

import org.mapstruct.Mapper;

import com.gateway.smartflow.client.Client;

@Mapper(componentModel = "spring")
public interface ClientMapper {

	ClientDto clientToClientDto(Client client);

	Client clientDtoToClient(ClientDto clientDto);
}
