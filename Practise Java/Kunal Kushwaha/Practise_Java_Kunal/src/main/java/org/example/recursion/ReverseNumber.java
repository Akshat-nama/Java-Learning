package org.example.recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(134));
    }

    public static int reverse(int n ){
        if(n%10 == n)
            return n;
        return (int) ((n%10 * Math.pow(10, digitCurrent(n))) + reverse(n/10));
    }

    private static int digitCurrent(int n) {
//        int ct = 0;
//        while(n%10 != n ){
//            n = n/10;
//            ct++;
//        }
//        return ct;

        return (int) Math.log10(n);
    }
}
