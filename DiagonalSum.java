package com.ankesh.learning;

import java.util.HashMap;

public class DiagonalSum {

    static int getSum(int[][] arr, int m, int n){
        int sum =0;
        int max = Math.max(m, n);
        int[][] arr1 = new int[max][max];
        HashMap<Integer,Integer> map = new HashMap<>();
        //copy arr to arr1
        for(int i=0;i<max; i++){
            for(int j=0; j<max; j++){
                if(i<m && j<n){
                    arr1[i][j] = arr[i][j];
                }
                else {
                    arr1[i][j] = 1;
                }
                int x = map.getOrDefault(arr1[i][j], 0);
                map.put(arr1[i][j], x+1);

                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        // Find Sum
        for(int i=0;i<max; i++){
                if(map.get(arr1[i][i])<2){
                    sum +=arr1[i][i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,78},{4,78,33}};
        System.out.println( "Sum is = " + getSum(arr, 2,3));
    }
}
