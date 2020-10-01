import java.util.*; 
import java.math.*; 
public class LCM 
{ 
    public static int lcm(int a,int b) 
    { 
        return (Math.abs(a*b))/gcd(a,b); 
    } 
    public static int findLcm(int[]a,int size) 
    { 
        int result1=a[0]; 
        for(int i=1;i<size;i++) 
        { 
            result1=lcm(a[i],result1); 
        } 
        return result1; 
    } 
    
    public static void main(String args[]) 
    { 
        Scanner s=new Scanner(System.in); 
        int size=s.nextInt(); 
        int[]a=new int[size]; 
        for(int i=0;i<size;i++) 
        { 
            a[i]=s.nextInt(); 
        } 
      
        System.out.println("LCM is "+findLcm(a,size)); 
    } 
} 
