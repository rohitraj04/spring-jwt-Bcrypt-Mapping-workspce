package com.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.security.dto.OrderResponse;
import com.security.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query("Select  new com.security.dto.OrderResponse(emp.userName , lap.brandName) FROM  Employee emp JOIN emp.laptops lap")
	List<OrderResponse> getJoinInformation();
}
