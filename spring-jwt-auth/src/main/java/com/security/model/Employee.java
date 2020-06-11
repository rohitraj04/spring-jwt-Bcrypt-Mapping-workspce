package com.security.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "xe_Employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 2409557704122325504L;
	@Id
	@GeneratedValue
	private Long empId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String designation;
	private Long salary;
	@OneToMany(targetEntity = Laptop.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_fk" , referencedColumnName = "empId")
	private List<Laptop> laptops;
	

}
