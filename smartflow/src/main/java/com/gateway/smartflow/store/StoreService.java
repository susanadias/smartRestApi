package com.gateway.smartflow.store;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gateway.smartflow.store.dto.StoreDto;


public interface StoreService {
	
	Page<StoreDto> findStoreByClientId(String clientId, Pageable pageable);
	
	StoreDto findStoreById(Long storeId);
	
	Store saveStore(StoreDto storeDto);
	
	Store editStore(Long storeId, StoreDto storeDto);
	
	void deleteStore(Long storeId);

}
