package org.example.class5;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("Plase enter your first name");
        String firstName=scan.next();
        System.out.println(firstName);

        System.out.println("enter full name");
        String fullName=scan2.nextLine();
        System.out.println(fullName);
    }
}
