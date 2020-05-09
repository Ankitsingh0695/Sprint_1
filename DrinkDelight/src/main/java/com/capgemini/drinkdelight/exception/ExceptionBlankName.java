package com.capgemini.drinkdelight.exception;
public class ExceptionBlankName extends Exception
{
	@Override
	public String toString() 
	{
		return "Name can't be Empty";
	}
}
