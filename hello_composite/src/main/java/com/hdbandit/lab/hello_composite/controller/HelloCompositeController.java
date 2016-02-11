package com.hdbandit.lab.hello_composite.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hdbandit.lab.hello_interface.exception.LanguageNotFoundServiceException;
import com.hdbandit.lab.hello_interface.model.HelloResponse;
import com.hdbandit.lab.hello_interface.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloCompositeController {
	
	@Autowired
	private HelloService helloService;

	@RequestMapping(method = RequestMethod.GET)
	public HelloResponse sayHello(@RequestParam(value = "lang") @NotNull String language) throws LanguageNotFoundServiceException {
		return helloService.sayHello(language);
	}

}
