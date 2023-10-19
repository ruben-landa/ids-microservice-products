package com.ids.ids;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class IdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdsApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI()
				.info(new Info()
						.title("IDS ")
						.version("0.0.1")
						.description("Microservice implementation of products"));
		
	}
}
