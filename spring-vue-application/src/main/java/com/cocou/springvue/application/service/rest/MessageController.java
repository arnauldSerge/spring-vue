package com.cocou.springvue.application.service.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
	@GetMapping("hello")
	public String hello() {
		return "Full stack  spring vueJs";
	}
}
