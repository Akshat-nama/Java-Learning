package org.example.dsa;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5,6,7,8,8};
        int n = findDuplicate(arr);
        System.out.println(n);
    }

    private static int findDuplicate(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swapDigits(nums, i, correct);
            }else
                i++;

        }

        return nums[nums.length - 1];
    }


    private static void swapDigits(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
