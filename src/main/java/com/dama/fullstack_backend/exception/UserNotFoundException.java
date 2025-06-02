package com.dama.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(Long id) {
		super("could not found the User with id "+id);
	}
}
