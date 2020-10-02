import java.util.*;
public class Reverse{
    public static void main(String args[]){
        String x=new String();
        String rev="";
        
        System.out.println("Enter the string");
        Scanner name=new Scanner(System.in);
        x=name.nextLine();
        for(int i=x.length()-1; i>=0; i--)
        {
            rev=rev+x.charAt(i);
        }
        System.out.println(rev);
    }
}
