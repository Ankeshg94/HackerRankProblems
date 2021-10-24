package com.ankesh.learning;


import java.util.HashMap;

/*
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.

Example 1:

Input:
N = 3
A[] = {1,2,3}
Output:
-1
Explanation:
Since, each element in
{1,2,3} appears only once so there
is no majority element.
Example 2:

Input:
N = 5
A[] = {3,1,3,3,2}
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is
the majority element.
 */
public class MajorityElement {

    static int majorityElementUsingHashMap(int a[], int size)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++){
            map.put(a[i] , map.getOrDefault(a[i],0)+1);
        }

        for(int i=0; i<size; i++){
            if(map.get(a[i])>size/2){
                return a[i];
            }
        }

        return -1;
    }

    // reduces space complexity
    static int majorityElementOptimized(int a[], int size){
        int comaringIndex = 0;
        int count=1;

        for(int i=1; i<size; i++){
            if(a[i]==a[comaringIndex]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                comaringIndex =i;
                count=1;
            }
        }

        int count1= 0;
       for(int i=0; i<size; i++){
           if(a[i]==a[comaringIndex]){
               count1++;
           }
       }

       return count1>size/2?a[comaringIndex]:-1;
    }
    public static void main(String[] args) {

    }
}
