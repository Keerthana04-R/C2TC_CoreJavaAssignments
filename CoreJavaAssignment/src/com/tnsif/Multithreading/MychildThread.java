package com.tnsif.Multithreading;

public class MychildThread {

	public class MyChildThread extends Thread {
		
		public void run() {
			System.out.println("In side run() Thread is alive or not? " + this.isAlive());
			int no = 0;
			while (no < 4) {
				no++;
				System.out.println("number = " + no);
				try {
					sleep(500);

				} catch (InterruptedException exp) {
					System.err.println("Thread Interrupted ...");
				}
			}
		}
	}

	public String isAlive() {
		// TODO Auto-generated method stub
		return null;
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
	