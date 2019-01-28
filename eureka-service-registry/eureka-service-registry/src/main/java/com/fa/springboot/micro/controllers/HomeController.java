package com.fa.springboot.micro.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@RequestMapping(value="home",method=RequestMethod.GET)
	public ResponseEntity<RequestDto> home(HttpServletRequest requestor){
		RequestDto request=new RequestDto();
		request.setUsername("Hello world logeshwari suganya");
		return new ResponseEntity<RequestDto>(request, HttpStatus.OK);
	}
	
}
