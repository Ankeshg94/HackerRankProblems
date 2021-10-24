package com.ankesh.learning;

/*
Given an array of integers print the missing elements that lie in range 0-99. If there are more than one missing, collate them, otherwise just print the number.
Note that the input array may not be sorted and may contain numbers outside the range [0-99], but only this range is to be considered for printing missing elements.

Examples :

Input: {88, 105, 3, 2, 200, 0, 10}
Output: 1
        4-9
        11-87
        89-99


Input: {9, 6, 900, 850, 5, 90, 100, 99}
Output: 0-4
        7-8
        10-89
        91-98
 */

public class MissingNumbers {

    static void findAndPrintMissingNumbers(int[] arr) {
        boolean[] booleans = new boolean[100];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 99 && arr[i] >= 0) {
                booleans[arr[i]] = true;
            }
        }

        int i = 0;
        while (i < 99) {
            if (!booleans[i]) {
                int j = i + 1;
                while (j<=99 && !booleans[j]) {
                    j++;
                }
                if (i == j-1) {
                    System.out.println(i);
                } else {
                    System.out.println(i + "-" + (j - 1));
                }
                i = j;
            }
            else{
                i++;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {88, 105, 3, 2, 200, 0, 10,101,123,566};
        findAndPrintMissingNumbers(arr);
    }
}
