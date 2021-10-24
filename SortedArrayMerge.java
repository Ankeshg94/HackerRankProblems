package com.ankesh.learning;

public class SortedArrayMerge {

    static void  merge(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length&& j<arr2.length){
            if(arr1[i]>arr2[j]){
                arr[k] = arr2[j];
                i--;
            }
            else if(arr2[j]>arr1[i]){
                arr[k] = arr1[i];
                j--;
            }
            i++;
            j++;
            k++;
        }

        if(i<j){
            for(int m=i; m <arr1.length ;m++){
                arr[k] = arr1[m];
                k++;
            }
        }

        if(j<i) {
            for (int m = j; m < arr2.length; m++) {
                arr[k] = arr2[m];
                k++;
            }
        }
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {11,17,21,29,38,99};
        int[] arr2 = {-1,4,9,25,32};
        merge(arr1, arr2);
    }
}
