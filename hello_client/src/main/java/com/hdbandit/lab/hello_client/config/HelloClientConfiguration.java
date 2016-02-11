package com.hdbandit.lab.hello_client.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.hdbandit.lab.hello_interface.config.HelloExceptionCodesConfiguration;

@Configuration
@EnableFeignClients(basePackages = {"com.hdbandit.lab.hello_client.client"})
@ComponentScan(basePackages = {"com.hdbandit.lab.hello_client.error_decoder"})
@Import(HelloExceptionCodesConfiguration.class)
public class HelloClientConfiguration {


}
