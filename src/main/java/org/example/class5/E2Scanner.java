package org.example.class5;



import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a byte");
        byte num=scanner.nextByte();
        System.out.println("Enter souble");
        double num2=scanner.nextDouble();
        byte smallbox=(byte)num2;
        System.out.println(smallbox);
        System.out.println("Enter bool");
        boolean bool=scanner.nextBoolean();
        System.out.println("Enter your first name");

        System.out.println(num);
        System.out.println(num2);
        System.out.println(bool);
    }



}
