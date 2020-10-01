import java.util.Scanner;
public class ncr{
  private static long long int factorial(int n){
    if(n>=0){
        if(n==0 || n==1){
            return 1;
        }else{
              return n*fact(n-1);
        }
    } else{
      System.out.println("Factorial not defined for negative numbers!!");
      return 0;
    }
  }
  
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n,r;
      n = sc.nextInt();
      r = sc.nextInt();
      System.out.println(n+"C"+"r = "+(fact(n)/(fact(r)*(fact(n-r))));
  }
}
