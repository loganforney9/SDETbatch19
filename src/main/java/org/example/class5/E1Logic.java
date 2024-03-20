package org.example.class5;

import java.util.Scanner;

public class E1Logic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your country");


        //! NOT (reverses condition)

        String country=scan.nextLine();
        if(!country.equalsIgnoreCase("Iran")){
            System.out.println("you can visit US");
        }


    }
}
