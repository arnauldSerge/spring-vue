package com.cocou.springvue.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cocou.springvue")
public class SpringVueApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVueApplication.class, args);
	}

}
