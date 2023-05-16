package com.portfolio.FPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude={DataSourceAutoConfiguration.class})
public class FpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FpaApplication.class, args);
	}

}
