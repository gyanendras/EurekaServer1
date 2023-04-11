package com.ness.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ECommEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(ECommEurekaServer.class, args);
	}

}
