package com.loginCrudApp.service;

import com.loginCrudApp.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);

}
