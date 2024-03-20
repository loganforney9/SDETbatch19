package org.example.class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How Old are you");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("we will give a drivers liscense");
        } else if (age >= 16) {
            System.out.println("you get learns permit");

        } else {
            System.out.println("you can not drive");
        }
        System.out.println("Thanl you for coming to the dmv");

    }
}
