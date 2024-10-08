package org.example.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/1390884395/
public class FindAllDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,5,7,8,2,3,1};
        List<Integer> n = findDuplicate(arr);
        System.out.println(n);
    }

    private static List<Integer> findDuplicate(int[] nums) {
        int i = 0 ;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swapDigits(nums, i, correct);
            }else
                i++;

        }

        System.out.println(Arrays.toString(nums));
        List<Integer> ans = new ArrayList<>();

        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
                ans.add(j+1);
                return ans;
            }
        }

        return ans;


    }


    private static void swapDigits(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
