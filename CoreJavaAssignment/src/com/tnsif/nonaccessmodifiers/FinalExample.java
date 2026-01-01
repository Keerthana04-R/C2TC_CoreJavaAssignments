package com.tnsif.nonaccessmodifiers;


public class FinalExample {
	
	
	int x = 200;
	
	void print() {
		System.out.println("Print the value of x: "+ x);
	}

	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
		fe.print();
		
		fe.x = 500; 
		
		fe.print();
		

	}

}

class Example extends FinalExample{
	void print() {
		
	}
}

	
