package com.security.service;

import java.util.List;

import com.security.dto.OrderRequest;
import com.security.dto.OrderResponse;
import com.security.model.Employee;

public interface EmployeeService {
	
	Employee saveEmp(OrderRequest orderRequest);
	
	List<Employee> fetchEmp();
	
	List<OrderResponse> getJoinInformation();

}
