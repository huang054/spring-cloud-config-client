package com.client.springbootcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCloudClientApplication {

	public static void main(String[] args)
	{
		SpringApplication springApplication= new SpringApplication(SpringBootCloudClientApplication.class);
         springApplication.setWebEnvironment(true);
		springApplication.run(args);
	}

}
