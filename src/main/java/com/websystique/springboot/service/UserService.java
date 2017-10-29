package com.websystique.springboot.service;


import java.util.List;

import com.websystique.springboot.model.User2;

public interface UserService {
	
	User2 findById(Long id);

	User2 findByName(String name);

	void saveUser(User2 user);

	void updateUser(User2 user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<User2> findAllUsers();

	boolean isUserExist(User2 user);
}