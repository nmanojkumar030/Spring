package com.npntraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Drawing {

	/**
	 * There may be a situation when you create more than one bean of the same type
	 * and want to wire only one of them with a property. In such cases, you can use
	 * the @Qualifier annotation along with @Autowired to remove the confusion by
	 * specifying which exact bean will be wired.
	 */
	@Autowired
	@Qualifier("square")
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
