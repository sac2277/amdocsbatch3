package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCount {
	
	@RequestMapping("/get")
	public String show() {
		return "Welcome to spring boot";
		
	}
	@RequestMapping("/set")
	public String show2() {
		return "another url mapping";
		
	}

}
