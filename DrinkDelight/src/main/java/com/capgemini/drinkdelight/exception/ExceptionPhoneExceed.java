package com.capgemini.drinkdelight.exception;
public class ExceptionPhoneExceed extends Exception
{
	@Override
	public String toString() 
	{
		return "Mobile Number length exceed";
	}
}
