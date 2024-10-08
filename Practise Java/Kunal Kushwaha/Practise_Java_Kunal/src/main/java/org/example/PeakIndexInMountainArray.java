package org.example;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4, 6, 7, 9, 4, 2, 1};
        int target = 4;

        int res = peakIndexInMountainArray(arr);
        System.out.println("The peak element in the mountain array is "+ arr[res]);
        int ans = -1;
        ans = findInPart(arr, 0, res, true, target);
        if(ans == -1){
            ans = findInPart(arr, res, arr.length -1, false, target);
        }

        System.out.println("The target element is present at index "+ ans);

    }

    private static int findInPart(int[] arr, int start, int end, boolean isAsc, int n) {

        while (start <= end) {
            int mid = start + (end - start) / 2; //This is a better approach to write a mid because in some case start + end exceeds the range of integer
            if (arr[mid] > n) {
                if(isAsc){
                    end = mid-1  ;
                }else{
                    start = mid+1;
                }

            } else if (arr[mid] < n) {
                if(isAsc){
                    start = mid + 1;
                }else{
                    end = mid + 1;
                }

            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length - 1;

        while(start != end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return start;
    }
}
