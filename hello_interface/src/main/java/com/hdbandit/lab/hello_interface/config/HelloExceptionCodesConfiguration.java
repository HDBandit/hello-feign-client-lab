package com.hdbandit.lab.hello_interface.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hdbandit.lab.hello_interface.exception.ExceptionResolverByCode;
import com.hdbandit.lab.hello_interface.exception.LanguageNotFoundServiceException;

@Configuration
public class HelloExceptionCodesConfiguration {

	@Bean(name = "hello-exception-resolver")
	public ExceptionResolverByCode exceptionResolverByCode() {
		ExceptionResolverByCode exceptionResolverByCode = new ExceptionResolverByCode();
		exceptionResolverByCode.registry(10001, LanguageNotFoundServiceException.class);
		return exceptionResolverByCode;
	}
}
