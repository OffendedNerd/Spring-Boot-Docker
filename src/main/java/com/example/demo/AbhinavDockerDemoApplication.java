package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/dockerdemo")
public class AbhinavDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbhinavDockerDemoApplication.class, args);
	}
	@GetMapping()
	public String getGreeting(){
		return "Welcome to the Demo!!!";
	}

}