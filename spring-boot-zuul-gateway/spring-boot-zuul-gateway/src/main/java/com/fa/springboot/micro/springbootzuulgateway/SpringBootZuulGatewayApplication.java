package com.fa.springboot.micro.springbootzuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@EnableZuulProxy
//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@ComponentScan("com.fa.springboot.micro")
@RestController
public class SpringBootZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulGatewayApplication.class, args);
	}

}

