package com.fa.springboot.micro.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulControllers {

	@RequestMapping("/")
    public String home() {
        return "welcome to zuul";
    }
}
