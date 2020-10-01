package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the principle = "); //ENTERING PRINCIPLE FROM USER
        float p = scan.nextFloat();

        System.out.println("Enter the rate = ");      //ENTERING RATE FROM USER
        float r = scan.nextFloat();

        System.out.println("Enter the time = ");      //ENTERING RATE FROM USER
        float t= scan.nextFloat();

        float si = (p*r*t)/100;
        System.out.println("Simple interest is " +si);

    }
}
