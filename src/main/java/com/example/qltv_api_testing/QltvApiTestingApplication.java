package com.example.qltv_api_testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Process","com.example.qltv_api_testing","Object"})
public class QltvApiTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(QltvApiTestingApplication.class, args);
	}

}
