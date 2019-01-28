package com.fa.springboot.micro.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	
	@RequestMapping(value="/")
	public String home(){
		return "hai i am product service";
	}
	
	@RequestMapping(value="/test")
	public String test(){
		return "hai iam test";
	}
	
}
