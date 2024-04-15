package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/jenkins")
public class JenkinscidcDockerhubApplication {

	@GetMapping("/cicddockerhub")
	public String getMessage()
	{
		return "cicddockerhub";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinscidcDockerhubApplication.class, args);
	}

}
