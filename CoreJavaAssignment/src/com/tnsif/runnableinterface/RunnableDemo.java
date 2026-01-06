package com.tnsif.runnableinterface;

public class RunnableDemo {
	
	    public static void main(String[] args) {

	        Runnable runnable1 = new Runnable() {
	            public void run() {
	                System.out.println("Runnable with Anonymous Class");
	            }
	        };

	        Thread t1 = new Thread(runnable1);
	        t1.start();

	        Runnable runnable2 = () -> {
	            System.out.println("Runnable with Lambda Expression");
	        };

	        Thread t2 = new Thread(runnable2);
	        t2.start();

	        System.out.println("--------------------------------");

	        int n = 5;
	        Runnable runnable3 = () -> {
	            try {
	                for (int i = 1; i <= n; i++) {
	                    System.out.println("Loop iteration: " + i);
	                    Thread.sleep(1000);
	                }
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        };

	        Thread t3 = new Thread(runnable3);
	        t3.start();
	    }
	}


	