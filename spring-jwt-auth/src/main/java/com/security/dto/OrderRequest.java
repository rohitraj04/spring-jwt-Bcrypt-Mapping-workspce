package com.security.dto;

import java.io.Serializable;

import com.security.model.Employee;
import com.security.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest implements Serializable {

	private static final long serialVersionUID = 7246744712236737107L;
	
//	private User user;
	private Employee employee;

}
