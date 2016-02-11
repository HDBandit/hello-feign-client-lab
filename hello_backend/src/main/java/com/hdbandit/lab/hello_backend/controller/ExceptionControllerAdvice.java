package com.hdbandit.lab.hello_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.google.gson.JsonObject;
import com.hdbandit.lab.hello_interface.exception.ExceptionResolverByCode;
import com.hdbandit.lab.hello_interface.exception.ServiceException;

@ControllerAdvice
public class ExceptionControllerAdvice {
	
	@Autowired
	private ExceptionResolverByCode exceptionResolverByCode;

	@ExceptionHandler(value = ServiceException.class)
	public ResponseEntity<String> handleError(ServiceException exception, WebRequest request) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("errorMessage", exception.getMessage());
		jsonObject.addProperty("errorCode", String.valueOf(exceptionResolverByCode.getCode(exception.getClass())));
		return new ResponseEntity<String>(jsonObject.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
