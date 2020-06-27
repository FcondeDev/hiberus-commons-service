package com.hiberus.commons.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1472314766847317114L;
	private final String resourceNotFound;

	public NotFoundException(String resourceNotFound) {
		this.resourceNotFound = resourceNotFound;
	}

}
