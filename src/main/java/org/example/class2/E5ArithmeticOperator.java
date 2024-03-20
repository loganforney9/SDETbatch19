package org.example.class2;

public class E5ArithmeticOperator {
    public static void main(String[] args) {
        //Addition
        //use +
        //When varible is of type String concat happens
        //When varible is Int Java adds
        int num1=100;
        int num2=20;
        int result=num1+num2;
        System.out.println(result);

        int num3=10000;
        long num4=1000000000L;
        long result2=num3+num4;
        System.out.println(result2);
        //different varible types ccan be addeded together

        String words="exp";
        System.out.println(words+num4);
        //concatination happens

        boolean trail=true;
        System.out.println(trail+words);
    }


}
