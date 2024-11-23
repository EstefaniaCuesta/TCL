package com.clt.pruebatecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PruebatecnicaApplication {
	public static void main(String[] args) {
		SpringApplication.run(PruebatecnicaApplication.class, args);
	}
}
