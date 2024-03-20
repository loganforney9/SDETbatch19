package org.example.class6;

import java.util.Scanner;

public class E5Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting point");
        int start=scan.nextInt();
        while(start<10){
            System.out.print(start+" ");
            start++;

        }
    }
}
