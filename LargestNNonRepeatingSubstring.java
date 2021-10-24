package com.ankesh.learning;

import java.util.HashMap;
//TODO
// correct this logic
public class LargestNNonRepeatingSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int ans=0;

        HashMap<Character, Integer> map = new HashMap<>();

        while(true &&  s.length()>0){
            boolean flag1 = false;
            boolean flag2 =false;
            //acquire
            while(i<s.length()){
                flag1 = true;
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)<2){
                    int len = i-j;
                    if(len>ans) ans=len;
                }
                else {
                    i++;
                    break;
                }
                i++;
            }

            //release
            while(j<i){
                flag2 = true;
                char ch = s.charAt(j);
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==1){
                    j++;
                    break;
                }
                j++;
            }

            if(!flag1 && !flag2){
                return ans+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ab"));
    }

}

