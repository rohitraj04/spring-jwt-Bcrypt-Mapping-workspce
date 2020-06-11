package com.security.service;

import java.util.List;

import com.security.dto.OrderRequest;
import com.security.model.User;

public interface UserService {

	User savUser(User user);
	

	List<User> fetchAll();
}
