package com.security.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse implements Serializable {

	private static final long serialVersionUID = -5160862937909032327L;
	private String userName;
	private String brandName;
	private String modelNumber;
	
	public OrderResponse(String userName, String brandName) {
		super();
		this.userName = userName;
		this.brandName = brandName;
	}
	
	

}
