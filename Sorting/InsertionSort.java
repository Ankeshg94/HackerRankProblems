package com.ankesh.learning.sorting;

public class InsertionSort {

    //In selection sort we consider the 1st element as sorted hence we start from index 1 and try to insert it at appropriate place,
    // for example : {89.20,12,9} -> here we will start from 20 and compare it with 89 -> as it is less than 89 we will insert it before 89
    // hence the array becomes {20,89,12,9} => now pick 12 => we will compare it with 89 and 20 and and hence it will be inserted before 89 and 20 => {12,20,89,9}
    // now compare 9 => {9,12,20,89}

    static void sort(int[] arr){
        int length = arr.length;
        for(int i=1; i<length; i++){
            for (int j=i; j>0; j--){
                if(arr[j-1]>arr[j]){
                    swap(arr, j);
                }
            }
        }
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item+" ");
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,20,0,25,30,-8};
        sort(arr);
    }
}
