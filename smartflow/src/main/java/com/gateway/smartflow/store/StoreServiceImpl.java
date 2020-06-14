package com.gateway.smartflow.store;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class StoreServiceImpl implements StoreService {
	
private static final Logger logger = LogManager.getLogger(StoreServiceImpl.class);
	
	@Autowired
	private StoreRepository roleRepository;

	@Override
	public Page<Store> findStoresByClientId(Long clientId, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
