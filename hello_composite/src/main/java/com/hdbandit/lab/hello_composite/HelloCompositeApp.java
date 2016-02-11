package com.hdbandit.lab.hello_composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

import com.hdbandit.lab.hello_client.config.HelloClientConfiguration;

@SpringBootApplication
@EnableEurekaClient
@Import(HelloClientConfiguration.class)
public class HelloCompositeApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloCompositeApp.class, args);
	}

}
