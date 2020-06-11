package com.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.dto.OrderRequest;
import com.security.dto.OrderResponse;
import com.security.model.Employee;
import com.security.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private PasswordEncoder encrypt;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmp(OrderRequest orderRequest) {
		Employee employee = orderRequest.getEmployee();
		System.out.println(orderRequest);
		final String password = encrypt.encode(employee.getPassword());
		employee.setPassword(password);
		System.out.println(orderRequest);
		return employeeRepository.save(orderRequest.getEmployee());
	}

	@Override
	public List<Employee> fetchEmp() {

		return employeeRepository.findAll();
	}

	@Override
	public List<OrderResponse> getJoinInformation() {

		return employeeRepository.getJoinInformation();
	}

}
