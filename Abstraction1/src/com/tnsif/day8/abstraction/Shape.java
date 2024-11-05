package com.tnsif.day8.abstraction;

public abstract class Shape {
	protected float area;
	abstract void calArea();///abstract method
	//concrete method
	void show() {
		System.out.println("Area of Shape is "+area);
	}
}
