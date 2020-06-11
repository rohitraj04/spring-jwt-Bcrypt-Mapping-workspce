package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.security.dto.AuthenticationRequest;
import com.security.dto.AuthenticationResponse;
import com.security.dto.OrderRequest;
import com.security.model.User;
import com.security.service.JwtUtil;
import com.security.service.UserService;

@RestController
public class UserController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserService userService;

	@Autowired
	private JwtUtil jwtUtil;

	@RequestMapping("/")
	public String getM() {

		return "Welcome Dude!";
	}

	@RequestMapping(value = "/autheticate", method = RequestMethod.POST)
	public ResponseEntity<?> generateToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUserName(), authenticationRequest.getPassword()));
		} catch (Exception e) {
			throw new Exception("Invalid UserName /Password");
		}
		final String jwt = jwtUtil.generateToken(authenticationRequest.getUserName());

		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}

	@PostMapping("/addUser")
	public ResponseEntity<?> addUsers(@RequestBody User user) {
		userService.savUser(user);
		return ResponseEntity.ok(user);

	}

}
