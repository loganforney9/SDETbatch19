package org.example.class4;

public class E2IfEseIf {
    public static void main(String[] args) {
        int day=10;

        if(day==1){
            System.out.println("Monday");
        }//the rest of the code will not print because the code stops at the end of the firt if statement
        else if (day==2) {
            System.out.println("tuesday");
        } else if (day==3) {
            System.out.println("wednesday");
        } else if (day==4) {
            System.out.println("thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Sayurday");
        } else if (day==7) {
            System.out.println("Sunday");
        }else{
            System.out.println("your calander is wrong");
        }
    }
}
//this code asks a day and returns a day of the week if() checks condition
//else if()checks condition if the first one is wrong
//else() prints if none of the conditons are right
