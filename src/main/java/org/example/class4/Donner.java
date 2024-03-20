package org.example.class4;

public class Donner {
    public static void main(String[] args) {
        int age = 18;
        int weight = 100;
        if (age >= 18) {
            if (weight >= 110) {
                System.out.println("you can donate blood");
            } else {
                System.out.println("you are not eligible");
            }
        } else {
            System.out.println("you are not eligible2");
        }
    }
}
