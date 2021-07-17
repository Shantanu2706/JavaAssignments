package com.test;
import com.shape.*;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square square = new Square();
		square.setSide(2);
		Rectangle rectangle = new Rectangle();
		rectangle.setBreadth(3);
		rectangle.setLength(4);
		square.calcArea();
		square.calcPeri();
		rectangle.calcArea();
		rectangle.calcPeri();

	}

}
