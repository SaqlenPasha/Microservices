package com.microservice.accounts.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

// It will be final and immutable by default, and it will have a 
//constructor, getters, equals, hashCode, and toString methods generated automatically due to "record".
// Drawback of this is that, fields of record are final. Hence, we will have to restart the microservice to load the config server chanegs
//Use a class Instead


@Data
@ConfigurationProperties(prefix="accounts")
public class AccountsConfigDTO{

	private String message;
	private Map<String, String> contactDetails;
	private List<String> onCallSupport;
	
}
