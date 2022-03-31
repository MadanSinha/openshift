package com.test.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entitys.Demo;

@RestController
@RequestMapping("/test")
public class TestController {

	 @Value("${MY_VALUE}")
	private String myValue;
	
	@GetMapping("/demo")
	public Demo getPerson() throws UnknownHostException {
		Demo person =new Demo();
		InetAddress localhost = InetAddress.getLocalHost();
		person.setInstance(localhost.getHostName());
		person.setEnvValue(myValue);
		return person;
	}
}
