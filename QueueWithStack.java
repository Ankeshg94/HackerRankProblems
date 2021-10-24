package com.ankesh.learning.DataStructures.Queue;

import java.util.Stack;

public class QueueWithStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    void enQueue(int a){

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(a);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    int dequeue(){
        if (stack1.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }
        int x = stack1.peek();
        stack1.pop();
        return x;
    }

    void printQ(){
        while (!stack1.isEmpty()){
            int x = stack1.peek();
            stack1.pop();
            System.out.println(x + " ");
        }
    }

    public static void main(String[] args) {
        QueueWithStack q = new QueueWithStack();
        q.enQueue(7);
        q.enQueue(8);
        q.enQueue(99);
        q.enQueue(4);

        q.dequeue();

        q.printQ();
    }
}
