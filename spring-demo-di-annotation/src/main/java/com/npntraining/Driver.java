package com.npntraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-demo.xml");
		Drawing drawing = (Drawing) applicationContext.getBean("drawing");
		drawing.draw();

	}

}
