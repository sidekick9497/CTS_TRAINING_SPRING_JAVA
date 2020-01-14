package com.cts.training.arrayimpl;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayImpl {
	
	public static int avearge(int size,int number)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[size];
		int counter = 0;
		int sum = 0;
		
		while(counter != size) {
			try 
			{	System.out.println("enter NO." + (counter+1));
				array[counter] =Integer.parseInt( scanner.nextLine());
				counter++;
			}
			catch(NumberFormatException ex)
			{
				System.out.println("enter valid integer");
			
			}
		}
		int count = 0;
		scanner.close();
		for(int i: array)
		{	
			if(i%number == 0)
			{
				sum += i;
				count++;
			}
		}
		return sum/count;	
	}
	

	public static int avearge(int size)
	{
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[size];
		int counter = 0;
		int sum = 0;
		
		while(counter != size) {
			try 
			{	System.out.println("enter NO." + (counter+1));
				array[counter] =Integer.parseInt( scanner.nextLine());
				counter++;
			}
			catch(NumberFormatException ime)
			{
				System.out.println("enter valid integer");
			
			}
		}
		
		scanner.close();
		for(int i: array)
		{			
			sum += i;
			
		}
		return sum/size;
	
	}
	public static int minimumValuePosition(int[] array)
	{	
		int minPosition = 0;
		for(int i = 1; i<array.length;i++)
		{
			if(array[minPosition] > array[i])
			{
	
				minPosition = i;
			}
			
		}
		return minPosition;	
	}
}
