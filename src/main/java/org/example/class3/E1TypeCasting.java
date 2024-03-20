package org.example.class3;

public class E1TypeCasting {
    public static void main(String[] args) {
        byte num=10;
        int number=num;
        //this is where the type casting is happening
        //this is a widining type casting and java dose it for you
        System.out.println(number);

        int a =100;
        int b=1000;
        byte i=(byte)a;
        byte j=(byte)b;
        //this is narrowing
        // you are storing a larger varibale into a small box
        // this is done manual by me

        // the source data type is int
        //the destination data type is byte
        System.out.println(i);
        System.out.println(j);
        //the value was too big for a narrowing
        //we got a sudorandom value even though the program went through
        //must be careful
        //100 is small enough and fits
        //1000 is too big and returns -24



    }
}
