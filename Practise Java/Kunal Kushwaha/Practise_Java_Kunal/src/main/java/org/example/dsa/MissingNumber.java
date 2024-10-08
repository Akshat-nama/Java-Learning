package org.example.dsa;

//https://leetcode.com/problems/missing-number/submissions/1390814483/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,4, 1, 3, 7, 5, 6};

       int n = missingNumber(arr);
        System.out.println("The missing number is "+ n);
    }

    private static int missingNumber(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
            int correct = nums[i];
            if( (nums[i] != nums.length) && (nums[i] != nums[correct] )){
                swapNumbers(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != j){
                return j;
            }
        }

        return nums.length;

    }

    private static void swapNumbers(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
