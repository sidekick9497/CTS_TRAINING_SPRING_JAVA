package com.cts.training.pattern;


public class TrianglePattern 
{
	public static void  getPatternOne(int n)
	{
		TrainglePatternOne.pattern(n);
	}
	
	public static void getPatternTwo(int n) {
		TrainglePatternTwo.pattern(n);
		
	}
	
}

class TrainglePatternTwo
{
	public static void pattern(int n)
	
	{
		int number = n;
		int counter = 1;
		int spaces = number -1;
		while(counter<= number)
		{
			printLine(counter,spaces);
			spaces--;
			counter++;
		}
	
	}
	private static void printLine(int counter,int spaces)
	{	
		//print spaces
		for(int i=0;i<=spaces;i++)
		{
			System.out.print(" ");
		}
		//print numbers	
		for(int j =0; j<counter; j++)
		{
			System.out.print(" " + counter + " ");
		}
		System.out.println("");
		spaces--;
		
	}
	
}

class TrainglePatternOne
{
	
	public static void pattern(int n)
	{
	 int number = n;
	 int counter = 1;
	 int spaces = number -1;
	 while(counter <= number)
	 {
		printLine(counter,spaces);
		spaces--;
		counter++;
		
	 }
	}
	
	private static void printLine(int counter,int spaces)
	{	
		//print spaces before the first letter
		for(int i=0;i<=spaces;i++)
		{
			System.out.print(" ");
		}
		//print in increasing order
		for(int j=1; j<counter;j++)
		{
			System.out.print(j);
		}
		//print in decreasing order
		for(int k=counter; k>=1;k--)
		{	
			System.out.print(k);
		}
		// move to next line;
		System.out.println(" ");
	}

}	

 