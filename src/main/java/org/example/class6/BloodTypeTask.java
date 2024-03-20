package org.example.class6;

import java.util.Scanner;

public class BloodTypeTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter grade");
        char grade=scan.next().toLowerCase().charAt(0);

        switch (grade){
            case 'a':
                System.out.println("Excelent");
                break;
            case 'b':
                System.out.println("Good");
                break;
            case 'c':
                System.out.println("avg");
                break;
            case 'd':
                System.out.println("bad");
                break;
            default:
                System.out.println("fail");
                break;


        }

    }
}
