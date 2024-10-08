package org.example.dsa;


//https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(findFirstMissingPositive(nums));
    }

    private static int findFirstMissingPositive(int[] nums) {
        int i = 0 ;

        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swapNumbers(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int j = 0; j<nums.length ; j++){
            if(nums[j] != j+1){
                return (j+1);
            }
        }
        return nums.length + 1;
    }

    private static void swapNumbers(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
