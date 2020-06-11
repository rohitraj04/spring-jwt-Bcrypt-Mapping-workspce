package com.security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.dto.OrderRequest;
import com.security.dto.OrderResponse;
import com.security.model.Employee;
import com.security.service.EmployeeService;

@RestController()
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmplyoee")
	public ResponseEntity<?> saveEmployee(@RequestBody OrderRequest orderRequest) {
		employeeService.saveEmp(orderRequest);
		return ResponseEntity.ok(orderRequest);

	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> fetchAll(){
		return ResponseEntity.ok(new ArrayList<>(employeeService.fetchEmp()));
	}
	
	@GetMapping("/getInfo")
	public ResponseEntity<List<OrderResponse>> getJoinInfo(){
		return ResponseEntity.ok(new ArrayList<>(employeeService.getJoinInformation()));
	}
}
