package org.example;

public class SumOfStringProblem {
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};

        int m = 1;
        int n = 1;

        mergeSortedArray(nums1,m,nums2,n);
}

    private static void mergeSortedArray(int[] nums1, int m,  int[] nums2,int n) {

//        int i = 0 ;
//        int j = 0 ;
//        int k = 0;
//
//        int[] res = new int[nums1.length];
//
//
//
//        while (k < nums1.length){
//            if(nums2.length == 0 ){
//                res[k] = nums1[i];
//                i++;
//            }
//            else if(nums1[i] <= nums2[j] && i<m ){
//                res[k] = nums1[i];
//                i++;
//
//            }else{
//                res[k] = nums2[j];
//                j++;
//            }
//            k++;
//        }
//
//        for(int a = 0 ; a < res.length ; a++){
//            nums1[a] = res[a];
//        }
//
//        for(int a = 0 ; a < res.length ; a++){
//            System.out.print(nums1[a] + " " );
//        }


        /*
        * What are the cases that we are gonna face
        *
        * when m = 0 , n = 1 or more in this case all the elements of nums2 will be merged as it is in the nums1
        * when m = 1 or more, n = 0 in this case no need to do anything everything is already sorted
        * Till when my loop should run
        *   
        * */

    }
    }
