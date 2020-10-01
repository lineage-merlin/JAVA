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
		
        n = scan.nextInt();
        r = scan.nextInt();
		
        System.out.print((fact(n)/(fact(n-r))));
    }
}
