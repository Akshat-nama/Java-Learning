package org.example.dsa;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //DONE BY ME
//    private static void cyclicSort(int[] arr) {
//    int i = 0;
//     while(i < arr.length){
//         if(arr[i] == (i + 1)){
//             i++;
//         }else{
//             swapDigits(arr, i);
//         }
//     }
//    }
//
//    private static void swapDigits(int[] arr, int n){
//        int temp1 = arr[n];
//        int temp2 = arr[n] - 1;
//        arr[n] = arr[arr[n] - 1];
//        arr[temp2] = temp1;
//
//    }


    static void cyclicSort(int [] arr){
        int i = 0 ;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] !=  arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]  = arr[second];
        arr[second ] = temp;
    }
}
