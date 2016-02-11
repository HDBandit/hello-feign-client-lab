package com.hdbandit.lab.hello_interface.service;

import com.hdbandit.lab.hello_interface.exception.LanguageNotFoundServiceException;
import com.hdbandit.lab.hello_interface.model.HelloResponse;

public interface HelloService {
	
	HelloResponse sayHello(String language) throws LanguageNotFoundServiceException;

}
