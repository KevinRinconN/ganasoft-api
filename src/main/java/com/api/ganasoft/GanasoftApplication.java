package com.api.ganasoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GanasoftApplication {

	@GetMapping("/mensaje")
	public String message (){
		return "Funciono :)";
	}

	public static void main(String[] args) {
		SpringApplication.run(GanasoftApplication.class, args);
	}

}
