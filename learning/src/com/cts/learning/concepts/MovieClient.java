package com.cts.learning.concepts;

import java.util.Scanner;

public class MovieClient {
	static int s = 7;
	public static void main(String[] arguments)
	{ 
		/*Theatre theatre = new Theatre();
		theatre.bookTickets();
		MovieClient mc = new MovieClient();
		*/
		String s = "avc";
		String str = "avc";
		boolean b = (s == str);
		System.out.println(b);
	}
}
	class MatrixClient{
	public static void main(String[] args) {
		int rows,columns;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of rows :");
		rows = scanner.nextInt();
		System.out.println("Enter the number of columns");
		columns = scanner.nextInt();
		//.close();
		
		MatrixPro matrix = new MatrixPro(rows, columns);
		matrix.display();
		System.err.println("every element in matrix is one ?  " +matrix.isEveryElementOne());
		matrix.addColumnElements();
		
	}
}

