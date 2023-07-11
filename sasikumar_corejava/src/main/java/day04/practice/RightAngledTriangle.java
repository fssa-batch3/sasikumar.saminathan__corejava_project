package day04.practice;

import day04.solved.Polygon;

public class RightAngledTriangle extends Polygon {
	protected int hypotenuse;
	protected double length;
	protected double breadth;

	public RightAngledTriangle(int numberOfSides, int length, int breadth) throws Exception {
		super(numberOfSides);
		if (length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		return this.length * this.breadth;
	}

	public int getNumberOfSides() {
		return super.numberOfSides;
	}

	@Override
	public double calculateCircumference() {
		
		return super.numberOfSides*length;
	}

}