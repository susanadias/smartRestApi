package com.gateway.smartflow.user;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE u.client.id = ?1")
	Page<User> findUsersByClientId(@Param("clientId") Long clientId, Pageable pageable);
	
	@Query("SELECT u FROM User u WHERE u.client.id = ?1")
	Page<User> findUsersByClientIdTeste(@Param("clientId") Long clientId, Pageable pageable);
	
	
	

}
