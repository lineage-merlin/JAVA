
import java.util.*;
import java.math.BigInteger;
public class Combination {
    
    public static BigInteger Factorials(int n) {
        BigInteger result=BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;


    }
    public static void main(String args[]) 
    {
        int n,r;
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the value of n");
        n=in.nextInt();

        System.out.println("Enter the value of r");
        r=in.nextInt();

        BigInteger n1=Factorials(n);
        BigInteger n2=Factorials(r);
        BigInteger n3=Factorials(n-r);

        BigInteger result =n1.divide((n2.multiply(n3)));
        System.out.println(result);


    }

}
