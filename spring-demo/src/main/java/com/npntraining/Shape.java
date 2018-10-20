package com.npntraining;

public abstract class Shape {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	abstract public void draw();
}
