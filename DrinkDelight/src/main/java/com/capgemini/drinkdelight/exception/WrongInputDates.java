package com.capgemini.drinkdelight.exception;
public class WrongInputDates extends Exception
{
	@Override
	public String toString() 
	{
		return "Delivery Date must be Greater than Order Date";
	}
}
