package com.ankesh.learning;

public class RemoveDuplicatesFromArray {

    void removeDuplicates(int[] a){
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[a.length - 1];
        for (int i = 0; i <= j; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromArray removeDuplicatesFromArray = new RemoveDuplicatesFromArray();
        int[] arr = {1,3,3,3,6,8,9,9,9,10,10,12};
        removeDuplicatesFromArray.removeDuplicates(arr);
    }
}
