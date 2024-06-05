package com.depamine.depamine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DepamineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepamineApplication.class, args);
	}

}
