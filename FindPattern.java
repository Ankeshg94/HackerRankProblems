package com.ankesh.learning;

/*
Program to find all the patterns of 0(1+)0 in the given string is discussed here. Given a string containing 0's and 1's, find the total number of 0(1+)0 patterns in the string and output it.
0(1+)0 - There should be at least one '1' between the two 0's.
For example, consider the following string.

Input: 01101111010
Output: 3

Explanation:

01101111010 - count = 1

01101111010 - count = 2

01101111010- count = 3
 */

public class FindPattern {

    static void findPattern(String str){

       if(str.length()==0){
           return;
       }
       int i=0;
       int count=0;
       while(i<str.length()){
           if(str.charAt(i)=='0'){
               int j=i+1;
               while(j<str.length() && str.charAt(j)=='1'){
                   j++;
               }
               i= j;
               if(j<str.length()) {
                   count++;
               }
           }
           else{
               i++;
           }
       }
        System.out.println("count = " + count);
    }


    public static void main(String[] args) {
        findPattern("11101111010");
    }
}
