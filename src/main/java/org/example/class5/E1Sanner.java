package org.example.class5;

import java.util.Scanner;

public class E1Sanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();
        if (age > 18) {
            System.out.println("you can vote");
        }else{
            System.out.println("you need to wait");
        }

    }
}
