package com.cts.training.shapes;

public class Triangle extends Shape
{
	
	public Triangle(int base,int height)
	{
		super(2,"triangle");
		super.dimens[0]  = base;
		super.dimens[1]  = height;
	}

	@Override
	public double area() {
		
		return dimens[0]*dimens[1] * 0.5;
	}

	@Override
	public int perimenter() {
		
		return 3*dimens[0];
	}
	
}