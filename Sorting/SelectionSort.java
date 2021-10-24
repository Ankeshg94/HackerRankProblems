package com.ankesh.learning.sorting;

public class SelectionSort {


    static void sort(int[] arr){
       int length = arr.length;
        for(int i=0; i<length; i++){
            int min = arr[i];
            int min_index=i;
            for (int j=i+1; j<length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    min_index=j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[min_index] = temp;
        }

        printArray(arr);
    }


    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,-5,0,25,30,-8};
        sort(arr);
    }
}
