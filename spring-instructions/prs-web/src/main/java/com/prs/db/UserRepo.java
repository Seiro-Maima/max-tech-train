package com.prs.db;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prs.business.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	// method in interface are automatically abstract and public
	
	User findByUserNameAndPassword(String username, String password);
	
}
