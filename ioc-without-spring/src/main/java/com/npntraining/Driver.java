package com.npntraining;

public class Driver {

	public static void main(String[] args) {

		/*Drawing drawing = new Drawing();
		drawing.draw();*/
		
		Triangle triangle = new Triangle();
		Drawing drawing = new Drawing(triangle);
		drawing.draw();

	}

}
