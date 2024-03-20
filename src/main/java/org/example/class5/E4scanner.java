package org.example.class5;

import java.util.Scanner;

public class E4scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter age");
        int age=scan.nextInt();
        System.out.println("enter full name");
        scan.nextLine();//this fixes the probelm below
        //the method above is consuming the space that the computur thinks is my name
        String fullName=scan.nextLine();//It thinks that the blank space is the full name and code wont work
        //only happens if you are using any other method before from Scanner
        System.out.println("you are "+age+" and your name is "+fullName);
    }
}
//this whole thing is called clearing the buffer memory