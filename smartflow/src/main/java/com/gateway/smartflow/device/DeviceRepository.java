package com.gateway.smartflow.device;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface DeviceRepository extends CrudRepository<Device, Long>{
	
	@Query("SELECT d FROM Device d WHERE d.store.id = ?1")
	Page<Device> findDevicesByStoreId(@Param("storeId") Long storeId, Pageable pageable);
	

}
