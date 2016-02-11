package com.hdbandit.lab.hello_backend.controller;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hdbandit.lab.hello_interface.exception.LanguageNotFoundServiceException;
import com.hdbandit.lab.hello_interface.model.HelloResponse;
import com.hdbandit.lab.hello_interface.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController implements HelloService {

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public HelloResponse sayHello(@RequestParam(value = "lang") @NotNull String language) throws LanguageNotFoundServiceException {
		HelloResponse hr = new HelloResponse();
		if ("ES".equals(language)) {
			hr.setHelloMessage("Hola");
		} else if ("EN".equals(language)) {
			hr.setHelloMessage("Hello");
		} else {
			throw new LanguageNotFoundServiceException(String.format("Language not supported: %s", language));
		}
		
		return hr;
		
	}

}
