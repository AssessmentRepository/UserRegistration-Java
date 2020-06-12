package com.userRegistration.exception;

public class UserDoesNotExistException extends RuntimeException{
	public static  String message="user already exists !..please login";


	public UserDoesNotExistException()
	{
		
	}
	public UserDoesNotExistException(String message)
	{
		this.message=message;
	}
}
