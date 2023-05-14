package com.cocou.springvue.library.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties("service")
@Data
public class ServiceProperties {
	private String message;
	

}
