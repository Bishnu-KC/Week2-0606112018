package com.weektwo.java;

public class FinallyDemo {
	
	public static void main(String args[])
	{
		/*
		 * try
		 * {
		 * 	//statements;
		 * }
		 * catch()
		 * {
		 * 	//Handling Exception
		 * }
		 * finally
		 * {
		 * 	//statements;
		 * }
		 */
		try
		{
			int a=10/0;
			System.out.println("The value is: "+a);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero.");
		}
		finally
		{
			System.out.println("Finally block executes either there is exception or not in try/catch block.");
		}
		tryFinally();
	}
	public static int tryFinally()
	{
		try
		{
			return 234;
		}
		finally
		{
			System.out.println("Method Return some numbers");
		}
	}
	
		
	}


