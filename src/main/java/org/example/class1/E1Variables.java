package org.example.class1;

public class E1Variables {
    // Working step: how to store data.
    //comp like to seperate data and instructions --> we do this with variables to store data
    public static void main(String[] args) {
        //many types of variables(ints, texts, T/F)
        // three types of varibales to store whole number


        //1. btye; used to name varibles for easy ID
        byte age=80;
        /*
         "byte' is a data type: tells java we are trying to store whole number
         age is the name we give to the varible
         80 is the value we sotre in the age varible
         comp makes a box in its memory  named age and stores 80 in it
        comp now knows age is 80
        80 is varible
        age is name of varible
         byte is data type
        an only go up to 127
        */

        //2.
        short num=200;
        /*
        used to store whole numbers
        "short" is data type
         num is name of varible
        200 is varible named num
         short is different than byte because it has bigger perameters --> the comp makes more room in memory for larger data
         can only store up to 10,000
        */

        //3.
        int population=100000000;
        /*
         still whole  number
         stores up to billions
         This is the typical way to store a whole number
         store whole numbers with int
        */

        //4.
        long distanceFromSun=100000000000000000L;
        /*
         stores largest numbers
        need L after number in the varible layout
        dont use offten
        */
        /* NOTE: THESE HOLD THE NEGIVE RANGE TOO */
        /* These are all primitive numaric data types */


        System.out.println(population);

    }

}
