package com.microservice.loans.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="loans")
public class LoansConfigDTO{

	private String message;
	private Map<String, String> contactDetails;
	private List<String> onCallSupport;
	
}