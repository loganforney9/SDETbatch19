package org.example.class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String yesorNo = scan1.nextLine();
        if (yesorNo.equalsIgnoreCase("yes")) {
            boolean hasCard = true;
            if (hasCard) {
                System.out.println("what is the blance on the card");
                double balance = scan1.nextDouble();
                if (balance > 1000) {
                    System.out.println("Pay off asap");
                } else {
                    System.out.println("keep spending");
                }
            } else {
                System.out.println("we will offer yo a card");
            }
        } else {
            System.out.println("we will lone you a card");
        }

    }
}
