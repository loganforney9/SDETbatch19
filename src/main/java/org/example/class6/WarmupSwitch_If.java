package org.example.class6;

import java.util.Scanner;

public class WarmupSwitch_If {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        Scanner scan3=new Scanner(System.in);

        System.out.println("enter 1st number");
        int num1= scan.nextInt();
        System.out.println("Enter 2nd number");
        int num2=scan2.nextInt();
        System.out.println("Enter operation");
        char oper=scan3.next().charAt(0);

        switch (oper){
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
            case '+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("invaild imput");


        }

    }
}
