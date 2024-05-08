package com.springcore.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		//it is used to map code from external mapping
		//it scans the components from different packages also
		scanBasePackages = {
				//need to mention address from 1st common parent
				"com.springcore.springcoredemo",
				"com.springcore.util"
		}
)
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
