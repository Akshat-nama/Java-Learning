package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 13, 16, 19, 30, 40};
        int n = 52;
try{
    System.out.println("The ceiling number is " + searchNumber(arr, n));
}catch (Exception e){
    System.out.println("The ceiling number you are trying to find exceeds the limit of the array");
}

    }

    //So we need to search if the number exists or not and if it exists then at what index
    /*Let's say we need to find 30 in the above array
    start= 0 , end = 8, mid = 4
    13<30 -> start = 5, end = 8 , mid = 6
    19>30 -> st = 7, end = 8, mid = 7

    */
    private static int searchNumber(int[] arr, int n) {
        int end = arr.length - 1;
        int start = 0;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2; //This is a better approach to write a mid because in some case start + end exceeds the range of integer
            if (arr[mid] > n) {
                end = mid-1  ;
            } else if (arr[mid] < n) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}