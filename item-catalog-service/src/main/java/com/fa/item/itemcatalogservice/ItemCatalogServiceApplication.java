package com.fa.item.itemcatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;


@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
//@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com.fa.item")
//@EnableDiscoveryClient
public class ItemCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemCatalogServiceApplication.class, args);
		//new SpringApplicationBuilder(ItemCatalogServiceApplication.class).web(true).run(args);
	}

}

