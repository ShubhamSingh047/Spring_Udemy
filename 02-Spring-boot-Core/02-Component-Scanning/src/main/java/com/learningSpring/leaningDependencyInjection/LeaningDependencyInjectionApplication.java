package com.learningSpring.leaningDependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages ={
				"com.shubham.util",
				"com.learningSpring.leaningDependencyInjection"
		}
)
public class LeaningDependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaningDependencyInjectionApplication.class, args);
	}

}
