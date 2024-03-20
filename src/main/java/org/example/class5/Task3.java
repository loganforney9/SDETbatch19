package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("What is your city");
        String city=scan.nextLine();
        System.out.println("What is the temp in farenhight");
        double temp=scan2.nextDouble();
        double tempC=(temp-32)*(5/9);
        System.out.println("It is "+tempC+" in "+city);

    }
    }

