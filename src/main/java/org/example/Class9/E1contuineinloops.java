package org.example.Class9;

public class E1contuineinloops {
    public static void main(String[] args) {
        int [] numbers={10,25,45,66,85,100};
        int sum=0;
        int count =0;
        for(int n:numbers){
            if(n<=25){
                continue;
            }
            sum+=n;
            count++;


        }
        double avg;
        avg = (double) sum /count;
        System.out.println(avg);
    }
}
