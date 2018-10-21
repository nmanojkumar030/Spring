package com.npntraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Shape shape = (Shape) applicationContext.getBean(Shape.class);
		shape.draw();

		Drawing drawing = (Drawing) applicationContext.getBean(Drawing.class);
		drawing.draw();

	}

}
