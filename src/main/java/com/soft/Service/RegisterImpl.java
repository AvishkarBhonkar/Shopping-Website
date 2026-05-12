package com.soft.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.soft.Entity.UserEntity;
import com.soft.Repo.UserRepository;

@Service
public class RegisterImpl implements RegisterService{
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public void saveRegister(UserEntity custEnt) {
		
		custEnt.setPassword(encoder.encode(custEnt.getPassword()));
		custEnt.setRole("User");
		userRepo.save(custEnt);
	}
	
	public UserEntity loginUser(String email, String password) {
		return userRepo.findByEmail(email);
	}
}
