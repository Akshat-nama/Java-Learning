package org.example;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2,3,3,5,6,7,7};

        int i = 0;
        int j = 1;
        int k = 0;

        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[k] = nums[i];
                k++;
                i = j;
            }
            j++;
        }
        nums[k] = nums[nums.length - 1];
        k++;




        System.out.println("The value of k is " + k);
        for(int a = 0 ; a < nums.length ; a++){
            System.out.print(" "+ nums[a]);
        }

    }
}

