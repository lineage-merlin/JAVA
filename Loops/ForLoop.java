package com.loops;

public class ForLoop {

	//For loop is an iterative loop which is divided into three basic sections
	//for(startvalue;condition;increment)
	
	//The following program shows an implementation of for loop to print number from 1 to 10
	public static void main(String[] args) {
		
	
	for (int i = 0 ; i<10 ; i++) {
		System.out.println(i);
		}
	
	//An infinite loop (Do not run ...just for demonstration purposes)
	//An infinite loop is a loop which never terminates due to some unachievable condition
	
//	for(int i = 0 ; i<10 ; i--)
//	{
//		System.out.println("You have entered an infinite loop..press terminate button to exit");
//	}
	
	//Advanced for loop/ forEach loop
	//  iterates through the loop by saving each name into a particular object of string
	
	String names[]=new String[]{"Atul","Rakesh","John","Ramees","Fathima"};
	
	for(String x : names) {
		System.out.println(x);
	}
	
	}
	
}
