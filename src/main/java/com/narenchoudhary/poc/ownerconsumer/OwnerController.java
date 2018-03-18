package com.narenchoudhary.poc.ownerconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/owner-consumer")
public class OwnerController {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping("/get/{ownerId}")
	public Owner getOwner(@PathVariable("ownerId") int ownerId) {
		String url = "http://owner-producer-service/owner-producer/get/" + Integer.toString(ownerId);
		return restTemplate.getForObject(url, Owner.class);
	}
	
	@RequestMapping("/")
	public String home() {
		return "You are at root";
	}
}
