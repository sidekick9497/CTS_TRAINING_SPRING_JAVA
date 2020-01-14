package com.cts.training.shapes;

public class Circle extends Shape{
		double pi = 3.14;
		
		public Circle(int radius)
		{
			super(1,"circle");
			super.dimens[0] = radius;
		}

		@Override
		public double area() {
			
			return pi*dimens[0]*dimens[0];
		}

		@Override
		public int perimenter() {
			
			return ((int) (2*pi*dimens[0]));
		}
}

