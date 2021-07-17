package com.shape;

public class Rectangle implements Polygon {
	private float length;
	private float breadth;
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	
	public void calcArea() {
		System.out.println(this.length*this.breadth);
	}
	
	public void calcPeri() {
		System.out.println(2*(this.length+this.breadth));
	}
}
