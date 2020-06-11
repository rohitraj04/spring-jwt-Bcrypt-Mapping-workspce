package com.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.model.User;
import com.security.repository.LaptopRepository;
import com.security.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LaptopRepository laptopRepository;

	@Autowired
	private PasswordEncoder encrypt;

	@Override
	public User savUser(User user) {
		// TODO Auto-generated method stub
		final String passwordEncrypt = encrypt.encode(user.getPassword());
		user.setPassword(passwordEncrypt);
		return userRepository.save(user); 
	}

	@Override
	public List<User> fetchAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
