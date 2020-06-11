package com.security.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "xe_Laptop")
public class Laptop  implements Serializable{

	private static final long serialVersionUID = -5675149776356380464L;
	@Id
	@GeneratedValue
	private Long serialId;
	
	private String brandName;
	private String modelNumber;


}
