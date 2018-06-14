package com.weektwo.java;

public class OwnException {
	public static void main(String args[])
	{
		try
		{
			System.out.println("Try block.");
			throw new MyException("This is from my exception class.");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block.");
			System.out.println(e);
		}
	}

}
class MyException extends Exception
{
	String str1;
	public MyException(String str2) 
	{
		str1=str2;
	}
	public String toString()
	{
		return ("My Exception"+ str1);
	}
}
