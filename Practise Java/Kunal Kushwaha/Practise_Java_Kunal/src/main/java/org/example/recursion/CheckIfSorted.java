package org.example.recursion;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {2,3,9,9};

        System.out.println(check(arr,0));
    }

    public static boolean check(int [] arr, int i){
        if(i == arr.length - 1)
            return true;
        if(arr[i] <= arr[i+1]){
            return check(arr, i+1);
        }
        return false;
    }
}
