package com.ankesh.learning;

import java.util.HashSet;

/*
watch this video to understand logic
https://www.youtube.com/watch?v=sPAT_DbvDj0&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=43
 */
public class StringPermutations {

    static HashSet<String> set = new HashSet<>();
    static void printPermutations(String str, String ans){

        if(str.length() ==0){
            set.add(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String leftPart = str.substring(0,i);
            String rightPart = str.substring(i+1);

            printPermutations(leftPart+rightPart, ans + ch);
        }
    }

    public static void main(String[] args) {

        printPermutations("abbb","");
        set.forEach(System.out::println);

    }

}
