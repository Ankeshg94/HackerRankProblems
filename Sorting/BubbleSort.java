package com.ankesh.learning.sorting;

public class BubbleSort {

    static void sort(int[] arr){
        int length = arr.length;
        for (int i=0; i<length-1; i++){
            for(int j=0;j<length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int item : arr
             ) {
            System.out.print(item+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {25,001,22,22,23,00};
        sort(arr);
    }
}
