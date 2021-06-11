package com.rodrigodojo.cdv.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("too bad , your resource coudn't found T.T Id :" + id);
	}
}
