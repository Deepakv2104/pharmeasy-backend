package com.medicare.pharm_easy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.medicare.pharm_easy")
public class PharmEasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmEasyApplication.class, args);
	}

}
