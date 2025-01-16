package com.example.DeployTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployTestApplication.class, args);
	}


	@GetMapping("/")
	public String home() { return "This is a hosted site by Michael Akumasi!";}
}
