package com.hdbandit.lab.hello_client.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hdbandit.lab.hello_interface.exception.LanguageNotFoundServiceException;
import com.hdbandit.lab.hello_interface.model.HelloResponse;
import com.hdbandit.lab.hello_interface.service.HelloService;

@FeignClient("hello")
public interface HelloFeign extends HelloService{
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloResponse sayHello(@RequestParam(value ="lang") String language) throws LanguageNotFoundServiceException;

}
