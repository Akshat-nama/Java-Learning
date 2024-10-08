package org.example;

import org.w3c.dom.ls.LSOutput;

public class FindFirstAndLast {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 5, 5, 5, 9};
        int target = 3;

        int[] res = findFirstAndLast(nums, target);

        System.out.println("The first and the last occurrence of the target value " + target + " is " + res[0] + " and " + res[1]);
    }

    //bhyi first and last occurrence
    public static int[] findFirstAndLast(int[] arr, int target){
        int[] result = {-1,-1};

        result[0] = findOccurr(arr, target, true);

        if(result[0] != -1){
            result[1] = findOccurr(arr, target, false);
        }
        return result;
    }

    private static int findOccurr(int[] arr, int target, boolean isFirstOcc) {
        int start = 0;
        int end = arr.length - 1;
        int mid = -1;
        int ans = -1;
        while(start<=end){
             mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                ans = mid;
                if(isFirstOcc){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}


