package com.ankesh.learning;
/*
without using String
Program to replace all 0's with 1 in a given integer is discussed here. Given an integer as an input, all the 0's in the number has to be replaced with 1.

For example, consider the following number

Input: 102405

Output: 112415

Input: 56004

Output: 56114
 */
public class ConvertInteger {

    static int replace(int number){

//       if (number == 0)
//           return 0;
//
//       int digit = number%10;
//       if(digit==0){
//           digit =1;
//       }
//       return replace(number/10) * 10 + digit;

        return Integer.parseInt((number + "").replaceAll("0","1"));

    }
    public static void main(String[] args) {
        System.out.println(replace(1011910));

    }
}
