package com.userRegistration.exception;

public class UserAlreadyExistException extends RuntimeException {
public static  String message="user already exists !..please login";


public UserAlreadyExistException()
{
	
}
public UserAlreadyExistException(String message)
{
	this.message=message;
}
}
