package org.example;
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1376329689/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,12,28,34};
        int target = 6;

        int pivot = findPivot(arr);
        System.out.println("The position of the pivot is " + pivot + " and the pivot element is: " + arr[pivot]);
        int res = -1;
        res = binarySearch(arr, target, 0, pivot);

        if(res == -1){
            res = binarySearch(arr, target, pivot + 1, arr.length -1);
        }

        System.out.println("The given element is present at index " + res);
    }

    private static int binarySearch(int[] arr, int target, int start, int end){
        int mid = -1;
        while(start<=end){
            mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    private static int findPivot(int[] arr) {
        int start = 0 ;
        int end = arr.length - 1;
        int mid = -1;
        while(start<=end){
         mid = start + (end - start)/2;
         if(mid < end && arr[mid]>arr[mid+1]) {
             return mid;
         }else if (mid > start && arr[mid] <= arr[mid - 1]){
             return mid -1 ;
         }
         else if(arr[start] > arr[mid]){
             end = mid - 1;
         }else{
             start = mid + 1;
         }

        }
        return mid;
    }
}
