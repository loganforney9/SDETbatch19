package org.example.class6;

import java.util.Scanner;

public class E7WhileLoopWithScanner {
    public static void main(String[] args) {
        System.out.println("Enter start point");
        Scanner scan=new Scanner(System.in);
        int start=scan.nextInt();
        System.out.println("Enter end point");
        int end= scan.nextInt();
        System.out.println("enter step size");
        int stepSize=scan.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start=start+stepSize;
        }
    }
}
