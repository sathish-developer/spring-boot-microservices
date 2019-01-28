package com.fa.item.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fa.item.dto.RequestDto;

@RestController
//@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
public class ClientController {

	
	   @RequestMapping("/")
	    public String home() {
	        return "Hello world";
	    }
	
	   
	   
	   @RequestMapping("/getData")
	    public RequestDto getData() {
		   RequestDto requestdto=new RequestDto();
		   requestdto.setName("sathish");
		   requestdto.setMessage("welcome to the world of client");
	        return requestdto;
	    }
	
	
}
