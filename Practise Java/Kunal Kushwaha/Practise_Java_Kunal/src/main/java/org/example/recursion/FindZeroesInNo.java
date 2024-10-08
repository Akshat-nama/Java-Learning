package org.example.recursion;

public class FindZeroesInNo {
    public static void main(String[] args) {
        int n = 130901;
        System.out.println("There are " + countZero(n,0) + " zeroes in the number "+ n);
    }

    private static int countZero(int n, int ct) {

        if(n == 0){
            return ct;
        }
        if(n%10 == 0){
            return countZero(n/10, ct+1);
        }
        return countZero(n/10, ct);

    }
}
