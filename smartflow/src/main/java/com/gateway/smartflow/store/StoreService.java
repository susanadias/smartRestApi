package com.gateway.smartflow.store;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gateway.smartflow.user.User;


public interface StoreService {
	
	Page<Store> findStoresByClientId(Long clientId,Pageable pageable);

}
