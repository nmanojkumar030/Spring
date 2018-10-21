package com.npntraining;

public class Triangle extends Shape {

	public Triangle() {

	}

	public Triangle(String type) {
		this.setType(type);
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + this.getType());
	}

}
