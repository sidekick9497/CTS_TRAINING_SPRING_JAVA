package com.cts.training.pattern;

import java.beans.ConstructorProperties;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class substring {
	public static void main(String[] args)
	{
	/*	Scanner scanner = new Scanner(System.in);
		String myString = scanner.nextLine();
		String[] splittedString = myString.split(" ");
		String result = "";
		for (String string : splittedString) {
			result += string +"\n";
			
		}
	System.out.println(result);
	System.out.println(toggleAlpha("hello world"));
	*/
		try
		{
			int a = 3/0;
		}
		catch(Exception e)
		{
			/*StringWriter sw = new StringWriter();
			
			e.printStackTrace(new PrintWriter(sw));
			System.out.println(sw.toString());
			*/
				String s = "hello";
				s+=" hi";
				System.out.println(s);
		
		}
			}
	
	public static String toggleAlpha(String string)
	{
		String result =  "";
		for(int i = 0; i < string.length(); i++)
		{
			char c = string.charAt(i);
			if(i%2==0)
			{
				result += String.valueOf(c).toUpperCase();
			}
			else
			{
				result += String.valueOf(c).toLowerCase();
			}
			
		}
		return result;
	}
	

}
