import java.util.*;  

public class factorial {
  public static void main(String args[]){  
      Scanner sc=new Scanner(System.in);  //input
      int number= sc.nextInt();  

  int i,fact=1;  
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    //output
 }  
}
