package org.example.class3;

public class E3ifThen {
    public static void main(String[] args) {
        int age= 16;
        boolean isTrue=true;

        if(age>=18){
            System.out.println("you can vote");
        }else{
            System.out.println("you cant vote");
        }
        age=26;

        if (age>=18){
            System.out.println("now you can vote");
        }
    }
}
