package com.tnsif.day8.abstraction;

public class Rectangle extends Shape{
	private float width,height;
	public Rectangle() {
		this.width = 5.0f;
		this.width = 2.0f;
	}
	public Rectangle(float width, float height) {
		this.width=width;
		this.height=height;
	}
	@Override
	void calArea() {
		area=width*height;
	}
}
