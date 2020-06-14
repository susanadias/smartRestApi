package com.gateway.smartflow.store.dto;

import org.mapstruct.Mapper;

import com.gateway.smartflow.store.Store;

@Mapper(componentModel = "spring")
public interface StoreMapper {

	StoreDto storeToStoreDto(Store store);

	Store storeDtoToStore(StoreDto storeDto);

}
