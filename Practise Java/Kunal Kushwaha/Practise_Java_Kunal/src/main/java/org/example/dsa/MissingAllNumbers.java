package org.example.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class MissingAllNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        List<Integer> n = missingNumber(arr);
        System.out.println("The missing number is "+ n );
    }

    private static List<Integer> missingNumber(int[] nums) {
        int i = 0 ;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] !=  nums[correct]){
                swapNumbers(nums, i, correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != j+1){
                ans.add(j+1);
            }
        }

        return ans;

    }

    private static void swapNumbers(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
