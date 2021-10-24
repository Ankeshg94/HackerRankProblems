package com.ankesh.learning;

public class FibonacciSeries {

    public static int findFibonacciUsingWhile(int n){

        int n1=0, n2=1;

        if(n==0|| n==1){
            return n;
        }

        while(n>1){
            int temp = n2;
            n2 = n1+n2;
            n1 = temp;
            n--;
        }

        return n2;
        }


    public static int findFibonacciUsingDp(int n, int[] dp){

        if(n==0 || n== 1){
            return n;
        }

        if(dp[n] !=0){
            return dp[n];
        }

        System.out.println("Hello" + n);
        int result = findFibonacciUsingDp(n-1, dp) + findFibonacciUsingDp(n-2, dp);

        dp[n] = result;

        return result;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(findFibonacciUsingDp(10, new int[n+1]));

    }
}
