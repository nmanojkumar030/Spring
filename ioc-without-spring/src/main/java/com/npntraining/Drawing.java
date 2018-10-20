package com.npntraining;

public class Drawing {

	private Shape shape;
	// private Shape shape = new Triangle();

	public Drawing(Shape shape) {
		this.shape = shape;
	}

	public void draw() {
		this.shape.draw();
	}

}
