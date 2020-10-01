import java.util.Scanner;

public class JavaProgram
{
    public static int fact(int num)
    {
        int fact=1, i;
        for(i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int n, r;
        Scanner scan = new Scanner(System.in);
		
        n = scan.nextInt(); // input
        r = scan.nextInt(); // input
		
        System.out.print((fact(n)/(fact(n-r)))); // output
    }
}
