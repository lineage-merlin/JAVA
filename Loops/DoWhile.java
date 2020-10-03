package com.loops;

public class DoWhile {

	
	//The Do-While Loop is different from all the loops in such a way that
	//it runs atleast once whatever may be the exit condition
	
	public static void main(String[] args) {
		
		int num = 10;
		
		do {
			
			System.out.println("Do while loop has run once");
		} while (num<4);
		
		//try tweaking the values of num to greater than or less that the provided value
		//Did you encounter an infinite loop? How do you rectify it?
	}
}
