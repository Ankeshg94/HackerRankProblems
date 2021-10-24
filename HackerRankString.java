package com.ankesh.learning;

import java.util.ArrayList;
import java.util.List;

public class HackerRankString {


    public static String hackerrankInString(String s) {
        // Write your code here
        String hackerrank = "hackerrank";
        int matchingIndex = -1;
        for(int i=0;i<hackerrank.length();i++){
            boolean ismatch = false;
            for(int j=0; j<s.length();j++){
                if(hackerrank.charAt(i)==s.charAt(j)&& j>matchingIndex){
                    ismatch = true;
                    matchingIndex = j;
                    break;
                }
            }
            if(!ismatch){
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();

        strList.add("knarrekcah");
        strList.add("hackerrank");
        strList.add("hackeronek");
        strList.add("abcdefghijklmnopqrstuvwxyz");
        strList.add("rhackerank");
        strList.add("ahankercka");
        strList.add("hacakaeararanaka");
        strList.add("hhhhaaaaackkkkerrrrrrrrank");
        strList.add("crackerhackerknar");
        strList.add("hhhackkerbanker");

        strList.forEach(itrm ->  System.out.println(hackerrankInString(itrm)));
    }
}
