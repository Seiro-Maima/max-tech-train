package com.prs.db;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prs.business.Request;

public interface RequestRepo extends JpaRepository<Request, Integer> {

	// List to hold all requests with status "review" that do not belong to logged in user
	List<Request> findByStatusAndUserIdNot(String status, int userid);
	
}
