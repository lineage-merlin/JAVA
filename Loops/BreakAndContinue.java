package com.loops;

public class BreakAndContinue {
	
	//Break and Continue are most often used along with the loops to define a specific
	//exit or skip conditions.
	
	public static void main(String[] args) {
		
		
		for(int i= 0; i<10 ;i++) {
			
			System.out.println(i);
			
			if(i>5) {
				break;
			}
			
			
		}
		
		System.out.println("Break encountered and for loop exitted");
		
		
		// The program below shows the execution of continue
		// continue skips over to the condition expression without completing the rest of the loop
		// Use caution while using continue as the placement changes can affect the results obtained
		// Try changing the position to after the print statement or try removing the increment
		// step
		
		
		int j = 1;
		while(j<10) {
			
			if(j==5 || j==6) {
				j++;
				continue;
			}
			
			System.out.println(j);
			
			j++;
			
			
			
		}
		
	}

}
