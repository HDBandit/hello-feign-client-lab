package com.hdbandit.lab.hello_interface.exception;

import java.util.HashMap;

public class ExceptionResolverByCode {

	private HashMap<Integer, Class<? extends ServiceException>> mappings = new HashMap<Integer, Class<? extends ServiceException>>();
	
	public void registry(int code, Class<? extends ServiceException> exception) {
		mappings.put(code, exception);
	}
	
	public ServiceException getException(int code) throws InstantiationException, IllegalAccessException {
		return mappings.get(code).newInstance();
	}

}
