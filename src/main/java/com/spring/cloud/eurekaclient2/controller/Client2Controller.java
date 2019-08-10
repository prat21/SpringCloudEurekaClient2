package com.spring.cloud.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2Controller {
	
	@GetMapping("/values")
	public String giveValues(){
		System.out.println("In client2 controller");
		return "client2Values";
	}
}
