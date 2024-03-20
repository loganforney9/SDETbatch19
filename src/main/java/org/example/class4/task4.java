package org.example.class4;

public class task4 {
    public static void main(String[] args) {
        boolean degree = true;
        double gpa = 3.7;
        if (degree) {
            System.out.println("congrats");
            if (gpa >= 3.5) {
                System.out.println("you get a scholorship");
            } else {
                System.out.println("you should have studied harder");

            }
        } else {
            System.out.println("you do not have a degree");
        }
    }
}
