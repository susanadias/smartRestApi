package com.gateway.smartflow.store;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gateway.smartflow.exceptions.ResourceNotFoundException;
import com.gateway.smartflow.store.dto.StoreDto;
import com.gateway.smartflow.store.dto.StoreMapper;
import com.gateway.smartflow.user.User;
import com.gateway.smartflow.user.dto.UserDto;

@Service
public class StoreServiceImpl implements StoreService {

	private static final Logger logger = LogManager.getLogger(StoreServiceImpl.class);
	
	@Autowired
	private StoreRepository storeRepository;
	
	@Autowired
	private StoreMapper storeMapper;

	@Override
	public Page<StoreDto> findStoreByClientId(String clientId, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoreDto findStoreById(Long storeId) {

		return this.storeMapper.storeToStoreDto(
				this.storeRepository.findById(storeId).orElseThrow(() -> new ResourceNotFoundException(" Store Unavailable")));

	}

	@Override
	public Store createStore(StoreDto storeDto) {
		return this.storeRepository.save(this.storeMapper.storeDtoToStore(storeDto));
	}

	@Override
	public Store editStore(Long storeId, StoreDto storeDto) {
		Store store= this.storeMapper.storeDtoToStore(storeDto);
		store.setId(storeId);
		return this.storeRepository.save(store);	
	}

	@Override
	public void deleteStore(Long storeId) {

		Optional<Store> hasStore = this.storeRepository.findById(storeId);

		if (hasStore.isPresent()) {
			this.storeRepository.delete(hasStore.get());
		} else {
			throw new ResourceNotFoundException("Store Id not found with id : " + storeId);
		}
	}
	
}
