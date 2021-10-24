package com.ankesh.learning;

public class MaxSubArray {

    static void maxSubArraySum(int arr[], int size)
    {
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;
        for(int i=0; i<size; i++){
            curr_sum += arr[i];
            if(max_sum<curr_sum){
                max_sum = curr_sum;
            }
            if(curr_sum<0){
                curr_sum = 0;
            }
        }
        System.out.println("max = "+ max_sum);
    }

    public static void main(String[] args)
    {
        int a[] = { 2, -3, -4, -1, 0, -1, 5, 3 };
        int n = a.length;
        maxSubArraySum(a, n);
    }
}
