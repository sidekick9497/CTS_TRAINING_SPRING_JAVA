package com.cts.training.shapes;
import java.util.Random;

 public abstract class Shape {
	int[] dimens;
	String shapeName;
	String color;
	int borderWidth;
	String[] colors = new String[] {"white","black","red"};
	
	public Shape(int noOfDimens,String shapename)
	{
		this.dimens        =  new int[noOfDimens];
		this.shapeName     =  shapename;
		this.color         =  colors[new Random().nextInt(3)];
		this.borderWidth   =  new Random().nextInt(10);
	}
	public abstract double area();
	
	public abstract int perimenter();
	
	public String toString()
	{	
		return ("shape :" + shapeName + "  area:" + area() + " perimeter :"+ perimenter() + " color: " + color +"  border width  " + borderWidth);
		
	}
	

}






























