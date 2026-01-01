package com.tnsif.nonaccessmodifiers;



abstract class Shape_Example{
	
	abstract void draw();

}

class Square extends Shape_Example{
	
	void draw() {
		System.out.println("Drawing a circle");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		
		Square s = new Square();
		s.draw();
		
		
		

	}

}