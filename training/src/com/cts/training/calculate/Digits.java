package com.cts.training.calculate;


public class Digits {
	public static void digitToWords(int n)
	{
		DigitsToWords.getWord(n);
	}
	public static void digitExpandedForm(int n)
	
	{
		DigitsExpandedForm.expand(n);
	}
	public static void reverseDigit(int n)
	{
		DigitReverse.reverse(n);
	}

}
class DigitsToWords
{	
	public static void getWord(int n)
	{
	String word = "";
	String[] array= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	int counter =  1;
	int number = n;
	while(number >10) {
		number /=10;
		counter *= 10;
	}
	int temp;
	while(counter !=0)
	{
		temp =  n/counter;
	//	System.out.println("temp :" +temp +" num" + n);
		word += " " +array[temp];
		n %=  counter;
		counter /=10;
		
	}
	System.out.println(word);
		
	
}
}
class DigitsExpandedForm
{
	public static void expand(int n)
	{	String word = "";
		int counter =  1;
		int number = n;
		while(number >10) {
			number /=10;
			counter *= 10;
		}
		
		int temp;
		while(counter !=0)
		{
			temp =  n/counter;
			//System.out.println("temp :" +temp +" num" + n);
			word += temp +" * " + counter;
			
			n %=  counter;
			counter /=10;
			if(counter!=0)
			{
			word += " + ";}
		}
		System.out.println(word);
	}
	}
class DigitReverse
{
	public static void reverse(int n)
	{
		int num= n;
		int rev=0;
		while(num!=0) {
			int dig=num%10;
			rev = rev*10+dig;
			num=num/10;
		}
		System.out.println(rev);
		}
		
}
