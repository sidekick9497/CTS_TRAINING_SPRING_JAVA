package com.cts.training.client;

import java.util.Scanner;

import com.cts.training.arrayimpl.ArrayImpl;
import com.cts.training.calculate.Digits;
import com.cts.training.pattern.TrianglePattern;

public class Main {

	public static void main(String[] args) {
		System.out.println("enter a number :");
		Scanner scanner =  new Scanner(System.in);
		int number = scanner.nextInt();
		
		
		int choice = 0;
		while(choice != 4)
			{
			System.out.println("\n \nwhat to do with number \n 1.Reverse \n 2.convert to words \n 3.Expand \n 4.Exit");
			choice = scanner.nextInt();
			if(choice ==1)
			{
				Digits.reverseDigit(number);
			}
			else if(choice ==2)
			{
				Digits.digitToWords(number);
			}
			else if(choice ==3) {
				Digits.digitExpandedForm(number);
			}
			else if(choice ==4)
			{
				System.out.println("Exited");
				break;
			}
			else
			{
				System.out.println("invalid input");
			}
		}
		
		
		
	}

}
class MainPro
{
	public static void main(String[] args)
	{
		System.out.println("enter number of rows :");
		Scanner scanner =  new Scanner(System.in);
		int number = scanner.nextInt();
		TrianglePattern.getPatternOne(number);
		TrianglePattern.getPatternTwo(number);
	}
}



class ArrayTest
{
	public static void main(String[] args)
	{
		//System.out.println("the avearage is:  "+ArrayImpl.avearge(5,3));
		int[] myArray = {10,5,2,4,1,5,6,2};
		System.out.println("minimum position is: " + ArrayImpl.minimumValuePosition(myArray));
	}
}








