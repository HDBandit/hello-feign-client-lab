package com.hdbandit.lab.hello_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

import com.hdbandit.lab.hello_interface.config.HelloExceptionCodesConfiguration;

@SpringBootApplication
@EnableEurekaClient
@Import(HelloExceptionCodesConfiguration.class)
public class BackendHelloApp {

	public static void main(String[] args) {
		SpringApplication.run(BackendHelloApp.class, args);
	}

}
