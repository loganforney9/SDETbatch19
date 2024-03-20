package org.example.class8;

public class E2Array {
    public static void main(String[] args) {
        int [] numbers={10,20,30,45,35,50,100};

        for(int num:numbers){
            if(num>50){
                continue;//skips all the numbers over 50,once loop see count is gse back to loop
            }
            System.out.println(num);
            System.out.println(num+10);
            System.out.println(num-10);
            System.out.println(num*10);
            System.out.println(num/10);
            System.out.println(num%10);
            System.out.println("***");
        }
    }
}
