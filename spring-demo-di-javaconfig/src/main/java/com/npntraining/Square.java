package com.npntraining;

public class Square extends Shape {

	private int side;
	
	public Square(int side) {
		this.side = side;
	}

	public Square(String type) {
		this.setType(type);
	}

	
	public Square(String type, int side) {
		this.setType(type);
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + this.getType() + " of side " + this.side);
	}

}
