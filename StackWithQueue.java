package com.ankesh.learning.DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    static int curr_size;
    StackWithQueue()
    {
        curr_size = 0;
    }
    void push(int x){
        q2.add(x);

        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    void pop(){
        if (q1.isEmpty())
            return;
        q1.remove();
        curr_size--;
    }


    int top(){
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    static int size()
    {
        return curr_size;
    }

}

