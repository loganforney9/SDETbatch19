package org.example.Class9;

public class E5Array {
    public static void main(String[] args) {
        int [] numbers={10,25,45,66,85,100};
        int sum=0;
        int dev= numbers.length;
        for(int n:numbers){
            sum+=n;
        }
        double avg;
        avg = (double) sum /dev;
        System.out.println(avg);
    }
}
