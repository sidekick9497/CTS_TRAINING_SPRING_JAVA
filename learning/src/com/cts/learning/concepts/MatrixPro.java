 package com.cts.learning.concepts;

import java.util.Scanner;

public class MatrixPro {
	int[][] elements;
	int rows,columns;
	public MatrixPro(int rows,int columns)
	{	
		this.rows = rows;
		this.columns = columns;
		elements = new int[rows][columns];
		/*scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		rows = scanner.nextInt();
		System.out.println("Enter the number of columns");
		columns = scanner.nextInt();*/
		getInputs();
		
	}
	private void getInputs()
	{	int element;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("enter matrix["+i+"]["+j+"]");
				element = scanner.nextInt();
				elements[i][j] = element;
			}
			
		}
		scanner.close();
		
	}
	
	public void display() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(" " +elements[i][j]+ " ");
				
			}
			System.out.println("");
		}
		
	}
	public void addColumnElements()
	{	int sum = 0;
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				sum += elements[i][j];
			}
			System.out.println("sum of row "+ i+"is : " +sum);
			sum = 0;
		}
		
	}
	public boolean isEveryElementOne()
	{
	
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(elements[i][j] != 1)
				{
					return false;
				}
				
			} 
			
		}
		return true;
	}

}
