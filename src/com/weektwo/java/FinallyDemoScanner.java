package com.weektwo.java;

import java.util.Scanner;

public class FinallyDemoScanner {
	
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
	public static void tryFinally()
	{
		Scanner scan=new Scanner(System.in);
		try
		{
			int num= scan.nextInt();
		}
		finally
		{
			//System.out.println("Method Return some numbers");
			scan.close();
		}
	}
	
		
	}


