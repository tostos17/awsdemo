package com.fowobi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwshelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwshelloApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "hello world";
	}

}
