package com.test.organizationtest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class OrganizationTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationTestApplication.class, args);
	}
	
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "Ismael") String name) {
		return String.format("Hello %s!", name);
	}

}
