package org.example.Class9;

public class E1Arrays {
    public static void main(String[] args) {
        int [] nums={10,25,45,66,85,100};
        System.out.println(nums.length);
        System.out.println(nums[3]);
        //System.out.println(nums[-5]);

        for(int i = 0; i < nums.length; i++){
            System.out.println(i+ " "+nums[i]+" ");
        }
    }
}
