package org.example.class6;

import java.util.Scanner;

public class WarmupIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        System.out.println("enter 1st number");
        int num1 = scan.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = scan2.nextInt();
        System.out.println("Enter operation");
        char oper = scan3.next().charAt(0);

        if (oper=='*') {
            System.out.println(num1 * num2);
        } else if (oper=='/') {
            System.out.println(num1 / num2);
        } else if (oper == '+') {
            System.out.println(num1 + num2);

        } else if (oper == '+') {
            System.out.println(num1 + num2);

        } else if (oper == '-') {
            System.out.println(num1 - num2);
        } else {
            System.out.println("invaild");
        }
    }



        }


