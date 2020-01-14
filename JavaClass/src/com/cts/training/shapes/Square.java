package com.cts.training.shapes;

class Square extends Shape
{
	public Square(int side) {
		super(1,"Square");
		super.dimens[0] = side;
		
	}

	@Override
	public double area() {
		
		return dimens[0] * dimens[0];
	}

	@Override
	public int perimenter() {
		
		return dimens[0] * 4;
	}
	
}