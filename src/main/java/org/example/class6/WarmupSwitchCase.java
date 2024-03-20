package org.example.class6;

import java.util.Scanner;

public class WarmupSwitchCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birth Month");
        String month=scan.nextLine();
        switch(month){
        case("March"):
        case ("April"):
        case ("May"):
        System.out.println("Spring");
        break;
            case("June"):
            case("july"):
            case("august"):
                System.out.println("Summmer");
                break;
            default:
                System.out.println("Winter");

        }

    }
}
