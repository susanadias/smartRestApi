package com.gateway.smartflow.store;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gateway.smartflow.store.dto.StoreDto;
import com.gateway.smartflow.user.dto.UserDto;

@RestController
@RequestMapping("/api/v1/stores")
public class StoreController {
	
	private static final Logger logger = LogManager.getLogger(StoreController.class);
	   
	@Autowired
    private StoreService storeService;
	
	
	@GetMapping("/{storeId}")
	public ResponseEntity<StoreDto> getUserById(@PathVariable("storeId") String storeId) {
		logger.info("Get store by Id");
		StoreDto store = this.storeService.findStoreById(Long.valueOf(storeId));
		return new ResponseEntity<StoreDto>(store, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping
    public ResponseEntity<Store> create(@RequestBody StoreDto storeDto) {
		logger.info("Create a new store");
		Store store=this.storeService.createStore(storeDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(store);
    }
	
	@PutMapping("/{storeId}")
    public ResponseEntity<StoreDto> update(@PathVariable("storeId") String storeId, @RequestBody StoreDto storeDto) {
		logger.info("Edit Store");
		this.storeService.editStore(Long.valueOf(storeId), storeDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(storeDto);
    }
	
	@DeleteMapping("/{storeId}")
    public ResponseEntity<Void> update(@PathVariable("storeId") String storeId) {
		logger.info("Delete Store");
		this.storeService.deleteStore(Long.valueOf(storeId));
		return new ResponseEntity<Void>(HttpStatus.OK);
    }
	

}
