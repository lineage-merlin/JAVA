import java.util.Scanner;

public class nPr { 
	  static int factorial(int n) { 
	        if (n <= 1) 
	            return 1; 
	        return n * factorial(n - 1); 
	    } 
	  
	    static int npr(int n, int r) 
	    { 
	        return factorial(n) / factorial(n - r); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the values of n and r to calculate nPr:");
	    	int n = sc.nextInt(); 
	        int r = sc.nextInt(); 
	  
	        System.out.println(n + "P" + r + " = "
	                           + npr(n, r)); 
	    } 
}
