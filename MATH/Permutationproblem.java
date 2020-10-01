//@author meghnabajoria
package java.util;

public class Permutationproblem
{
   static int factorial(int n) 
   {
      int f;
      for(f = 1; n > 1; n--)
         f *= n;
      
      return f;
   }
   static int npr(int n,int r) 
   {
      return factorial(n)/factorial(n-r);
   }
   public static void main(String args[])
   {
      int n = 7;
      int r = 3;
      System.out.println("npr value is : "+npr(n,r));
   }
}