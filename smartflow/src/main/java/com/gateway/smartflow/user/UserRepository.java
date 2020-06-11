package com.gateway.smartflow.user;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	
	
	/*@Query(value = "SELECT * FROM user WHERE client_id = :clientId",
			countQuery = "SELECT count(*) user u WHERE u.client_id = :clientId",
			nativeQuery = true)
	Page<User> findUsersByClientIdJQL(@Param("clientId") String clientId, Pageable pageable);*/
	
	@Query("SELECT u FROM User u WHERE u.client.id = ?1")
	Page<User> findUsersByClientId(@Param("clientId") Long clientId, Pageable pageable);
	

}
