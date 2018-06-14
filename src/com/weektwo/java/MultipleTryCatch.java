package com.weektwo.java;

public class MultipleTryCatch {
	public static void main(String args[])
	{
		/*
		try
		{
			int a, b, d,f;
			a=0;
			b=5;
			d=b/a;
			int e[]= {1,2,3,4,5,6};
			e[6]=20/2;
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide By zero exception.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arrary Index out of range.");
		}
		*/try
		{
		int a = args.length;
	      System.out.println("a = " + a);
	      int b = 42 / a;
	      int c[] = { 1 };
	      c[42] = 99;
	    } catch(ArithmeticException e) {
	      System.out.println("Divide by 0: " + e);
	    } catch(ArrayIndexOutOfBoundsException e) {
	      System.out.println("Array index oob: " + e);
	}
	    System.out.println("After try/catch blocks.");
		System.out.println("End of Try Catch Block.");
		
	}

}
