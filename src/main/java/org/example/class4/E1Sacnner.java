package org.example.class4;

import java.util.Scanner;

public class E1Sacnner {
    public static void main(String[] args) {
        Scanner fetch= new Scanner(System.in);
        //Scanner is a class, just like E1scanner
        //scan is the varible that holds the object
        System.out.println("please enter your age");
        int age=fetch.nextInt();
        //we are calling the nextInt() method feom the Scanner code (called scan) which is a poece of code that takes an int from the keyboard
        //we take the int taken from scan.nextInt() into our age varible.
        System.out.println("you are "+age+ " years old");
    }
}
/*
"Scanner" = class name --> we are calling this class so we can take imput on the computer.
We would need to use 1000s of lines of code to do this, otherwise
"new Scanner(system.in) is fetching the code by making them into objects
we are storing the object(which is the Scanner class code) into the scan name

**Java code--> new Scanner(system.in) --> "Scanner fetch =" stores object as fetch --> we can call methods
from fetch becasue it stores and object that stores the method--> get data --> store data in our varibles

*/
