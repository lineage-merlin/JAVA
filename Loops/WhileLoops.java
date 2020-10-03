package com.loops;

public class WhileLoops {
	
	// The while loop works similar to the for loop
	// The only difference is that the increment statement is usually written at the end of the loop
	
	public static void main(String[] args) {
		
		
		int x =  0 ;
		
		while(x<10) {
			System.out.println(x);
			x++;
		}
		
	//while loops can be also used to check for boolean conditions and change execution
	//steps in accordance to it
	//while evaluates to a boolean check 
	//the below example checks if the condition is true
	//While(0) always evaluates to false and While(1) evalues to true
		
		int i = 1;
		boolean condition = true;
		
		while(condition) {
			
			
			
			if(i>=5) {
				condition=false;
			}
			
			System.out.println("Loop ran "+i+" times");
			
			
			i++;
			
			
			
		}
		
	}

}
