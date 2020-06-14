package com.gateway.smartflow.device;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Min;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gateway.smartflow.device.dto.DeviceDto;
import com.gateway.smartflow.store.Store;
import com.gateway.smartflow.store.dto.StoreDto;
import com.gateway.smartflow.user.dto.UserDto;

@RestController
@RequestMapping("/api/v1/")
public class DeviceController {
	
	private static final Logger logger = LogManager.getLogger(DeviceController.class);
	   
	@Autowired
    private DeviceService deviceService;
	
	
	@GetMapping("stores/{storeId}/devices")
    public  ResponseEntity<Map<String, Object>> getDevicesByStoreId(@RequestParam(defaultValue = "0") @Min(0) int page,
            @RequestParam(defaultValue = "10") @Min(1) int size,
            @PathVariable("storeId") String storeId) {
		
		logger.info("Get devices by store Id");
		
	     try {

			Pageable pageable = PageRequest.of(page, size);
			Page<DeviceDto> devicesPage = this.deviceService.findDeviceByStoreId(storeId, pageable);
			
			Map<String, Object> deviceResponse = new HashMap<>();
			deviceResponse.put("devices", devicesPage.getContent());
			deviceResponse.put("currentPage", devicesPage.getNumber());
			deviceResponse.put("totalItems", devicesPage.getTotalElements());
			deviceResponse.put("totalPages", devicesPage.getTotalPages());

			return new ResponseEntity<Map<String, Object>>(deviceResponse, new HttpHeaders(), HttpStatus.OK);

		} catch (Exception ex) {
			logger.error("Error to get devices from store" + storeId + ex);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
        
    }
	
	
	@GetMapping("/devices/{deviceId}")
	public ResponseEntity<DeviceDto> getUserById(@PathVariable("deviceId") String deviceId) {
		logger.info("Get device by ID");
		DeviceDto deviceDto=this.deviceService.findDeviceById(Long.valueOf(deviceId));
		return new ResponseEntity<DeviceDto>(deviceDto, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/devices")
    public ResponseEntity<Device> createDevice(@RequestBody DeviceDto deviceDto) {
		logger.info("Create a new device");
		Device device=this.deviceService.createDevice(deviceDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(device);
    }
	
	@PutMapping("/devices/{deviceId}")
    public ResponseEntity<DeviceDto> update(@PathVariable("deviceId") String deviceId, @RequestBody DeviceDto deviceDto) {
		logger.info("Edit Device");
		this.deviceService.editDevice(Long.valueOf(deviceId), deviceDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(deviceDto);
    }
	
	@DeleteMapping("/devices/{deviceId}")
    public ResponseEntity<Void> update(@PathVariable("deviceId") String deviceId) {
		logger.info("Delete Device");
		this.deviceService.deleteDevice(Long.valueOf(deviceId));
		return new ResponseEntity<Void>(HttpStatus.OK);
    }
	
	
	
	

}
