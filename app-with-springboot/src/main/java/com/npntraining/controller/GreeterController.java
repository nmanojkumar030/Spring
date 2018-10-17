package com.npntraining.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class GreeterController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World!!";
	}

}
