package com.example.simplewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimpleWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebAppApplication.class, args);
	}

	@RestController
	class HelloWorldController {

		@GetMapping("/")
		public String welcome() {
			return "Welcome, you are looking at Amarender's website !";
		}

		@PostMapping("/api/hello")
		public SampleJsonResponse hello(@RequestBody SampleJsonRequest request) {
			SampleJsonResponse response = new SampleJsonResponse();
			response.setMessage("Welcome " + request.getUser());
			response.setAuthor("Amarender Reddy Jakka");
			return response;
		}
	}

}
