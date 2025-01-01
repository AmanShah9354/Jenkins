package com.devops.Jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {

		SpringApplication.run(JenkinsApplication.class, args);
		for(int i=0;i<=12;i++){
			System.out.println("Hello world.. "+i);

		}
	}

}
