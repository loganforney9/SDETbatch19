package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How ammount is needed");
        int amount=scan.nextInt();
        if(amount<=200000){
            System.out.println("we will lend you money");
        }else{
            System.out.println("we will not give you a lone");
        }
        System.out.println("Thank you for banking with us");

    }
}
