package com.ankesh.learning.sorting;

public class MergeSort {
    static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] temArr = new int[(high-low)+1];

        while (i <= mid && j <= high) {
            if (arr[i] > arr[j]) {
                temArr[k] = arr[j];
                i--;
            } else if (arr[j] > arr[i]) {
                temArr[k] = arr[i];
                j--;
            }
            i++;
            j++;
            k++;
        }
        if (i <= mid) {
            for (int m = i; m <= mid; m++) {
                temArr[k] = arr[m];
                k++;
            }
        }
        if (j <= high) {
            for (int m = j; m <=high; m++) {
                temArr[k] = arr[m];
                k++;
            }
        }
        //copy temp array back to arr
        int s=0;
        for (int p = low; p <= high; p++) {
            arr[p] = temArr[s];
            s++;
        }
    }

    static void sort(int[] arr, int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 89, 1, 3, -1, 45,0,22,99};
        sort(arr, 0, arr.length - 1);
        printArray(arr);
    }


}
