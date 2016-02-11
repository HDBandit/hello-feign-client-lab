package com.hdbandit.lab.hello_interface.exception;

import java.util.HashMap;

public class ExceptionResolverByCode {

	private HashMap<Integer, Class<? extends ServiceException>> mappings = new HashMap<Integer, Class<? extends ServiceException>>();
	private HashMap<Class<? extends ServiceException>, Integer> reverseMappings = new HashMap<Class<? extends ServiceException>, Integer>();
	
	public void registry(int code, Class<? extends ServiceException> exception) {
		mappings.put(code, exception);
		reverseMappings.put(exception, code);
	}
	
	public ServiceException getException(int code) throws InstantiationException, IllegalAccessException {
		return mappings.get(code).newInstance();
	}
	
	public int getCode(Class<? extends ServiceException> exception) {
		return reverseMappings.get(exception);
	}

}
