package com.capgemini.drinkdelight.exception;
public class ExceptionEmailBlank extends Exception
{
	@Override
	public String toString() 
	{
		return "Can't Enter a empty Email";
	}
}
