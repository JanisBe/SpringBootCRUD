package com.websystique.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springboot.model.User2;
import com.websystique.springboot.repositories.UserRepository;



@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	public User2 findById(Long id) {
		return userRepository.findOne(id);
	}

	public User2 findByName(String name) {
		return userRepository.findByName(name);
	}

	public void saveUser(User2 user) {
		userRepository.save(user);
	}

	public void updateUser(User2 user){
		saveUser(user);
	}

	public void deleteUserById(Long id){
		userRepository.delete(id);
	}

	public void deleteAllUsers(){
		userRepository.deleteAll();
	}

	public List<User2> findAllUsers(){
		return userRepository.findAll();
	}

	public boolean isUserExist(User2 user) {
		return findByName(user.getName()) != null;
	}

}
