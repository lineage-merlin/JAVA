import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number whose factorial you wish to be calculated");
		int N = sc.nextInt();
		int fact=1;
		for(int i=1;i<=N;i++)
		{
		    fact=fact*i;
		}
		System.out.println("Factorial is=" +fact);
	}
}
