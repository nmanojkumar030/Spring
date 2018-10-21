package com.npntraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Shape getShape() {
		Shape shape = new Triangle();
		shape.setType("Triangle");
		return shape;
	}
	
	@Bean
	public Drawing getDrawing() {
		Drawing drawing = new Drawing(getShape());
		return drawing;
	}

}
