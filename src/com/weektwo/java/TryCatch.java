package com.weektwo.java;

public class TryCatch {
	public static void main(String args[])
	{
		int a,b;
		try
		{
			a=0;
			b=10/a;
			System.out.println("This block does not execute.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide By Zero Execption.");
		}
	}

}
