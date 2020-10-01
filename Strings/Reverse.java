import java.util.*;
public class Reverse{
    public static void main(String args[]){
        String x=new String();
        
        System.out.println("Enter the string");
        Scanner name=new Scanner(System.in);
        x=name.nextLine();
        char w[]=new char[x.length()];
        for(int i=0;i<x.length();i++){
            w[i]=x.charAt(i);
        }
        for(int i=w.length-1;i>=0;i--){
            System.out.printf("%c",w[i]);
        
        }
        System.out.printf("\n");
    }
}