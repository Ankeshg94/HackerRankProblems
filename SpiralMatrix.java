package com.ankesh.learning;

public class SpiralMatrix {


    static void printSpiralArray(int[][] arr){

        int top = 0, right = arr[0].length-1, bottom = arr.length-1, left = 0 ;
        int dir= 0;

        while(right>=left && bottom>=top){

            if(dir==0){
                for(int i=left; i<=right; i++) System.out.print(arr[top][i] + " ");
                top++;
            }
            else if(dir==1){
                for(int i=top; i<=bottom; i++) System.out.print(arr[i][right] + " ");
                right--;
            }
            else if(dir==2){
                for(int i=right; i>=left; i--) System.out.print(arr[bottom][i] + " ");
                bottom--;
            }
            else if(dir==3){
                for(int i=bottom; i>=top; i--) System.out.print(arr[i][left] + " ");
                left++;
            }
            dir =  (dir+1)%4;
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{18,29,20,12,55},{13,34,7,77,12},{65,11,33,55,6}, {67,5555,12,88,0}};
        printSpiralArray(arr);
    }
}
