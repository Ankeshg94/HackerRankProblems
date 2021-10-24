package com.ankesh.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class OverLappingTimeInterval {

    static public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Stack<Interval> stack1 = new Stack();
        Stack<Interval> stack2 = new Stack();

        Collections.sort(intervals);
        for(Interval interval: intervals){
            if(stack1.isEmpty()){
                stack1.push(interval);
            }
            else {
                Interval peek = stack1.peek();
                Interval toPush = processIntervals(interval, peek, stack1);
                stack1.push(toPush);
            }
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        ArrayList<Interval> list = new ArrayList<>();
        while(!stack2.isEmpty()){
            list.add(stack2.pop());
        }
        return list;
    }

    static Interval processIntervals(Interval input, Interval peek, Stack<Interval> stack1){
        if(input.start<=peek.end){
            Interval processed = new Interval();
            processed.start = peek.start;
            if(input.end>peek.end){
                processed.end = input.end;
            }
            else{
                processed.end = peek.end;
            }
            stack1.remove(peek);
            return processed;

        }
        return input;
    }

    public static void main(String[] args) {
        Interval i1 = new Interval(2,4);
        Interval i2 = new Interval(15,20);
        Interval i3 = new Interval(13,19);
        Interval i4 = new Interval(19,20);
        Interval i5 = new Interval(18,26);
        Interval i6 = new Interval(24,28);


        ArrayList<Interval> list1 = new ArrayList<>();
        ArrayList<Interval> list2 = new ArrayList<>();

        list2 = list1;

        System.out.println(list1==list2);

//        list.add(i1);
//        list.add(i2);
//        list.add(i3);
//        list.add(i4);
//        list.add(i5);
//        list.add(i6);
//
//        merge(list).forEach(item -> System.out.println(item.start + " " + item.end));
    }
}

class Interval implements Comparable<Interval>{

    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }


    @Override
    public int compareTo(Interval o) {
        if(this.start>o.start){
            return 1;
        }
        else if(this.start<o.start){
            return -1;
        }
        return 0;
    }
}
