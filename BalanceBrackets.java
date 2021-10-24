package com.ankesh.learning;

import java.util.ArrayList;
import java.util.Stack;

public class BalanceBrackets {

    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<x.length(); i++){
            char ch = x.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }
            else if(ch==')'){
                boolean val =  handleClosingClose(stack, '(');
                if(!val){ return false;}
            }
            else if(ch == '}'){
                boolean val = handleClosingClose(stack, '{');
                if(!val){ return false;}
            }
            else if(ch==']'){
                boolean val = handleClosingClose(stack, '[');
                if(!val){ return false;}
            }
        }

        return stack.isEmpty()?true:false;

    }


    static boolean handleClosingClose(Stack<Character> stack, char correspondingBracket ){
        if(stack.isEmpty()){
            return false;
        }
        if(stack.peek()==correspondingBracket){
            stack.pop();
        }
        else{
            return false;
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder("");
        ArrayList<Integer> list = new ArrayList<>();
        int j=0;
        int max =0;
        while(j<s.length()){
            for (int i = j; i < s.length(); i++) {
                if (sb.indexOf(s.charAt(i) + "") == -1) {
                    sb.append(s.charAt(i));
                } else {
                    if(sb.length()>max){
                        max=sb.length();
                        break;
                    }
                }
            }
            j++;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(ispar("[()]{}{[()()]()}"));
        lengthOfLongestSubstring("pwwkew");

    }
}
