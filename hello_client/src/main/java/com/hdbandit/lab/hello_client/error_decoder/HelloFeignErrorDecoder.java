package com.hdbandit.lab.hello_client.error_decoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hdbandit.lab.hello_interface.exception.ExceptionResolverByCode;
import com.hdbandit.lab.hello_interface.exception.ServiceException;

import feign.Response;
import feign.codec.ErrorDecoder;

@Component
public class HelloFeignErrorDecoder implements ErrorDecoder {
	
	@Autowired
	@Qualifier("hello-exception-resolver")
	private ExceptionResolverByCode exceptionResolverByCode;

	@Override
	public ServiceException decode(String methodKey, Response response) {
		try {
			return exceptionResolverByCode.getException(1001);
		} catch (InstantiationException e) {
			throw new IllegalStateException("Unexpected error occurs getting error code", e);
		} catch (IllegalAccessException e) {
			throw new IllegalStateException("Unexpected error occurs getting error code", e);
		}
	}


}
