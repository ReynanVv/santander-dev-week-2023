package br.inova;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default URL Server")})
@SpringBootApplication
public class SantanderDevWeek2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeek2023Application.class, args);
	}

}
