package com.soft.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.soft.Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	// @Query("FROM UserEntity u WHERE u.email = :email AND u.password = :password")
	 // UserEntity loginUser(@Param("email") String email, @Param("password") String password);
	    UserEntity findByEmail(String email);
	 
}
