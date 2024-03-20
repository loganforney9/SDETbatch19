package org.example.class5;

import java.util.Scanner;

public class E2Logic {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        boolean flowers=true;
        boolean choclotes=false;
        if(flowers||choclotes){
            System.out.println("Wife is Happy");
        }else{
            System.out.println("wife is sad");
        }
    }
}
