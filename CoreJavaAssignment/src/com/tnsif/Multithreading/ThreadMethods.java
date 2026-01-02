package com.tnsif.Multithreading;

public class ThreadMethods {
	

		public static void main(String[] args) {
			Childthread threadOne = new Childthread(); 
			Childthread threadTwo = new Childthread(); 
			System.out.println("Current Thread: " + Thread.currentThread());

			threadOne.start();
			threadTwo.start();
			Thread.currentThread().setName("Parent Thread"); 
			Thread.currentThread().setPriority(Thread.MIN_PRIORITY); 
			System.out.println("Current Thread: " + Thread.currentThread());
			threadOne.join(); 
			threadTwo.join();
			System.out.println("-----------------------End of Main--------------------------");
		}
	}
	