//Below is a rather optimised version of the CodeJam 2019 Qualification round.
//The question can be found at: https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/0000000000088231


//Code has been written so that when run through ide, it will take user input one by one
//To work on a file, please use compressed command line execution. For e.g. : java CodeJam2019 < input.txt > output.txt
//where input.txt is a text file containing input parameters
//and output.txt is a text file where the answers will be writen
import java.util.Scanner;

public class CodeJam2019 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int line = 1;
        scanner.nextLine();
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            System.out.print("CASE #" + (line++) + ": ");

            String x = String.valueOf(N);
            String alt = "";
            for (int i = 0; i < x.length(); i++) {
                int t = Integer.parseInt(String.valueOf(x.charAt(i)));
                if (t == 4) {
                    alt += "2";//any value from 1 to 3 is gonna work here!!
                }else{
                    alt += "0";
                }
            }
            int altnum = Integer.parseInt(alt);
            System.out.println(altnum + " " + (N-altnum));
        }
    }
}
