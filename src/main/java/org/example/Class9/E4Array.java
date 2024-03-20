package org.example.Class9;

public class E4Array {
    public static void main(String[] args) {

        int[] nums = {10, 25, 45, 66, 85, 100};
        int sum=0;
        int divide= nums.length;
        for (int i =0; i< nums.length;i++){
            sum+=nums[i];
        }
        double avg =(double)sum/divide;
        System.out.println(avg);
    }
}
