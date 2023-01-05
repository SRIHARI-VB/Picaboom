package com.stretch.stretch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StretchApplication {

	public static void main(String[] args) {
		SpringApplication.run(StretchApplication.class, args);
	}

}
