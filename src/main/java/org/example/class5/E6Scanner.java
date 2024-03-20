package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the gender m/f");
        char gender=scan.next().charAt(0);
        //we are using teo methods --> next() gets the first world charAt(0) picks the first letter.
        //everything starts at 0
        System.out.println(gender);
    }
}
