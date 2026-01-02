package com.tnsif.Multithreading;

public class ThreadDemo {
	
		public static void main(String[] args) {
			Childthread threadOne = new Childthread();
			Childthread threadTwo = new Childthread();

			threadOne.start();
			threadTwo.start();

			System.out.println("-----------------------End of Main--------------------------");
		}
	}
	