package com.shape;

public class Square implements Polygon{
	private float side;
	
	public void setSide(float side) {
		this.side = side;
	}
	
	public void calcArea() {
		System.out.println(this.side*this.side);
	}
	
	public void calcPeri() {
		System.out.println(this.side*4);
	}
}
