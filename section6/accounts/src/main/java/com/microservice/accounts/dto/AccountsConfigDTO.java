package com.microservice.accounts.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

// It will be final and immutable by default, and it will have a 
//constructor, getters, equals, hashCode, and toString methods generated automatically.
@ConfigurationProperties(prefix="accounts")
public record AccountsConfigDTO(String message, Map<String, String> contactDetails, List<String> onCallSupport) {

}
