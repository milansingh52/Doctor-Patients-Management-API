package com.ms.dpms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ms.dpms")
public class DpmsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DpmsBackendApplication.class, args);
	}
}
