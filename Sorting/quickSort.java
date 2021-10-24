package com.ankesh.learning.sorting;

public class quickSort {
    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j= high;

        while(i<j){
            while(i<arr.length && pivot>=arr[i]){
                i++;
            }
            while(j>=0 && pivot<arr[j]){
                j--;
            }
            if(i<j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    static void quickSort(int[] arr, int low, int high){

        if(low<high) {
            int j = partition(arr, low, high);
            quickSort(arr, low, j-1);
            quickSort(arr, j + 1, high);
        }
    }

    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item+" ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-5,0,25,90,-34,-1,-1,3,30,-8,887,555,-6,-5,0,-23,1,0,662};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);

    }
}
