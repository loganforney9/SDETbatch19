package org.example.class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("enter how many years you have worked");
        double years=scan1.nextDouble();
        System.out.println("what was your annual salary");
        double sal=scan2.nextDouble();
        if(years>=5){
            System.out.println("you are eligiable for a bounus");
            if(sal>=5000){
                System.out.println("your bonus is 5000");
            }else{
                System.out.println("your bonus is 3000");
            }
        }else{
            System.out.println("no bonus");
        }

    }
}
