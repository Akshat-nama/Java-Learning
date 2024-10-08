package org.example.dsa;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4 , 1, 2};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i = 0 ; i <= arr.length-2 ; i++){
            for(int j = i+1; j > 0 ; j-- ){
                if(arr[j] >= arr[j-1]){
                    break;
                }else{
                    swapDigits(arr , j );
                }
            }
        }
    }

    private static void swapDigits(int[] arr, int n) {
        int temp = arr[n];
        arr[n] = arr[n-1];
        arr[n-1] = temp;
    }
}
