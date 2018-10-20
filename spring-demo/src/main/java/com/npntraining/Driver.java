package com.npntraining;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-demo.xml");
		Drawing drawing = (Drawing) applicationContext.getBean("drawing");
		drawing.draw();

		/*ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext(
				"C:\\git_clones\\github\\Spring\\spring-demo\\src\\main\\resources\\spring-demo.xml");
		Drawing drawing = (Drawing) applicationContext2.getBean("drawing");
		drawing.draw();*/
		
		
		Square square = (Square) applicationContext.getBean("square");
		square.draw();
	}

}
