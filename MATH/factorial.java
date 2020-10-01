/*
 * Program to find Factorial of a number
 * This program can find Factorial of very large number
 *
 */

import java.util.*;
import java.math.BigInteger;
class Main {
    static String factorial(String n){
        // "count" variable counts from 1 to "n"
        BigInteger count = new BigInteger("1");
        // "one" increments "count" by 1
        final BigInteger one = new BigInteger("1");
        // "bn" is BigInteger representation of "n"
        BigInteger bn = new BigInteger(n);
        // "result" stores result
        BigInteger result = new BigInteger("1");
        while(bn.compareTo(count) >= 0){
            result = result.multiply(count);
            count = count.add(one);
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String n = s.next();
        if(!n.chars().allMatch( Character::isDigit )) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.println(factorial(n));
    }
}