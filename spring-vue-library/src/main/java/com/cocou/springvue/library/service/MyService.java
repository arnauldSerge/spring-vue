package com.cocou.springvue.library.service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.cocou.springvue.library.config.ServiceProperties;

import lombok.Data;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
@Data
public class MyService {
	private final ServiceProperties serviceProperties;

}
