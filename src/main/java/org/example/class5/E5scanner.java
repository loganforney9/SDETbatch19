package org.example.class5;

import java.util.Scanner;

public class E5scanner {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);

        System.out.println("enter age");
        int age=scan1.nextInt();
        System.out.println("enter full name");
        String fullName=scan2.nextLine();
        System.out.println("your age is "+age+" Your full name is "+fullName);
    }
}
