package com.hdbandit.lab.hello_interface.exception;

public class LanguageNotFoundServiceException extends ServiceException {

	private static final long serialVersionUID = 1L;

	public LanguageNotFoundServiceException() {

	}

	public LanguageNotFoundServiceException(String message) {
		super(message);
	}

	public LanguageNotFoundServiceException(Throwable cause) {
		super(cause);
	}

	public LanguageNotFoundServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public LanguageNotFoundServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
