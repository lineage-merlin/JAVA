import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
        int n,mul;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you number");
        n= sc.nextInt();
        Main obj= new Main();
        mul= obj.factorial(n);
        System.out.println("Factorial is "+mul);
        
    }
    int factorial(int x)
    {
        if(x>1){
            return(x*factorial(x-1));
        }
        return 1;
    }
}
