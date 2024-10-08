package org.example.recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,9,1,  10 , 21, 34, 45};
        int n = 34;

        System.out.println(check(arr,0, n));

    }

    public static boolean check(int [] arr, int i, int n){

//        if(arr[i] == n){
//            return true;
//        }
        if(i == arr.length - 1)
            return false;
//        return check(arr, i+1, n);

        return arr[i] == n || check(arr, i+1, n);

    }
}
