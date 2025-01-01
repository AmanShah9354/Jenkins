package com.devops.Jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++){
			System.out.println("Hello world.. "+i);
		}
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
