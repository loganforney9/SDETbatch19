package org.example.class4;

public class HW {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 20;
        int num3 = 3;

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);

            if (num2 > num3) {
                System.out.println(num2 + " is greater than " + num3);
            } else if (num2 < num3) {
                System.out.println(num3 + " is greater than " + num2);
            }
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
