package com.ankesh.learning;

/*
Given two binary strings a and b, return their sum as a binary string.
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */

public class AddBinaryNumbers {

    public static String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int sum=0;
        String result = "";

        while(i>=0||j>=0||sum==1){
            sum += i>=0?a.charAt(i)-'0':0;
            sum += j>=0?b.charAt(j)-'0':0;

            if(sum%2!=0){
                result = "1"  + result;
            }
            else{
                result = "0" + result;
            }
            sum /=2;
            i--; j--;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
}
