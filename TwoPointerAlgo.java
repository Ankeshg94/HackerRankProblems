package com.ankesh.learning;

import java.util.Arrays;
/*
 * 3-sum problem
 * given an array of integers, if there are any triplets present sum of which is zero return true else false.
 */
public class TwoPointerAlgo {

    static boolean findTriplets(int[] arr) {

        for(int i=0; i<arr.length-2; i++) {
            Arrays.sort(arr);
            if(findTwoSum(arr, -arr[i], i)) return true;
        }

        return false;
    }

    static boolean findTwoSum(int[] arr, int x, int i) {

        int j= arr.length-1;
        i=i+1;
        while(i<j) {

            if(arr[i] + arr[j]<x) {
                i++;
            }
            else if(arr[i] + arr[j]>x) {
                j--;
            }
            else if(arr[i] + arr[j] == x) {
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {4,9,3,-3,10,5};

        System.out.println(findTriplets(arr));
    }
}
