package com.capgemini.drinkdelight.exception;
public class ExceptionPhoneBlank extends Exception
{
	@Override
	public String toString() 
	{
		return "Phone Number can't be Empty";
	}
}
