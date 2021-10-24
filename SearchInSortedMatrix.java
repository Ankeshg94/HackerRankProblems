package com.ankesh.learning;

public class SearchInSortedMatrix {

    static void search(int[][] arr, int size, int searchElement){

    int i=0, j=size-1;

    while(i<size-1 && j>=0) {

        if(arr[i][j]==searchElement){
            System.out.println("found");
            System.out.println("i="+ i + "j=" + j);
            return;
        }
        if(arr[i][j]>searchElement){
            j--;
        }
        if(arr[i][j]<searchElement){
            i++;
        }
    }

    }

    public static void main(String[] args) {
            int mat[][] = { { 10, 20, 30, 40 },
                    { 15, 25, 35, 45 },
                    { 27, 29, 37, 48 },
                    { 32, 33, 39, 50 } };

            search(mat, 4, 80);

    }
}
