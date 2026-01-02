package com.tnsif.interfaces;

		
		interface Fruits{
			
		 void sweet() ; 
		 
			
		}

		public class InterfaceGreeting implements Fruits {

			public void sweet() {
				System.out.println("The fruits are sweet!!!"); 
			}
			
			
			
			public static void main(String[] args) {
				
				
				InterfaceGreeting obj1 = new InterfaceGreeting();
				obj1.sweet();

			}

	

		void greet() {
		}
		
		
	}
	