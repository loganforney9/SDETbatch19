package org.example.class6;

import java.util.Scanner;

public class WarmupE2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what is your country");
        String country = scan.nextLine();

        switch (country) {
            case "USA":
                System.out.println("We speak English");
                break;
            case "Spain":
                System.out.println("We speak Spainsih");
                break;
            case "Russia":
                System.out.println("We speak Russian ");
                break;
            default:
                System.out.println("country not in databse");
                break;
        }

        }
    }

