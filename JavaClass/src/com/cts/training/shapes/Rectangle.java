package com.cts.training.shapes;

public class Rectangle extends Shape
{
	public Rectangle(int length,int breadth)
	{
		super(2,"rectangle");
		super.dimens[0] = length;
		super.dimens[1] = breadth;
	}

	@Override
	public double area() {
		return dimens[0] * dimens[1];
	}

	@Override
	public int perimenter() {
		return (2*(dimens[0]+ dimens[1]));
	}
	
}
