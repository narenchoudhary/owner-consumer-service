package com.narenchoudhary.poc.ownerconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OwnerConsumerService {
	
	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(OwnerConsumerService.class).web(true).run(args);
	}
	
}
