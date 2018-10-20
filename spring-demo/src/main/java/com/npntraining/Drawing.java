package com.npntraining;

public class Drawing {

	private Shape shape;
	// private Shape shape = new Shape();

	public Drawing() {
	}

	public Drawing(Shape shape) {
		this.shape = shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void draw() {
		this.shape.draw();
	}

}
