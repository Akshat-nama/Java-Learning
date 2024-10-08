package org.example.recursion;

public class Fibbonacci {
    public static void main(String[] args) {
        int n = 8;
        int res = fibb(n);
        System.out.println("The "+ n+"th fibonacci number is "+ res);
    }

    private static int fibb(int n) {
//        if(n == 0){
//            return 0;
//        }
//
//        if(n == 1){
//            return 1;
//        }

        if(n<2){
            return n;
        }

        return fibb(n-1) + fibb(n-2);
    }
}
