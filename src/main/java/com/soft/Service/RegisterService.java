package com.soft.Service;

import com.soft.Entity.UserEntity;

public interface RegisterService {
	public void saveRegister(UserEntity custEnt);
	public UserEntity loginUser(String email, String password);
}
