package com.ankesh.learning.DataStructures.LiknedList;

import static java.lang.System.*;

public class MyLiknedList {
    Node head;

    void add(int data){
        if(head==null){
            head = new Node(data, null);
            return;
        }
        Node temp = head;
        while(temp.getNext()!=null){
        temp = temp.getNext();
        }
        temp.setNext(new Node(data,null));
    }

    void removeFromLast(){
        if (head==null){
            out.println("List is empty");
            return;
        }
        Node temp = head;
        Node prev = head;
        while(temp.getNext()!=null){
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(null);
    }

    Node removeDuplicates(Node head)
    {
        // Your code here
        Node curr = head;
        while(curr != null){
            Node temp = curr.getNext();
            while(temp != null && curr.getData()==temp.getData()){
                temp = temp.getNext();
            }

                curr.setNext(temp);
                curr = temp;
        }
        return head;
    }

    void printList() {
        if (head == null) {
            out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp.getNext()!=null){
            out.println(temp.getData());
            temp = temp.getNext();
        }
        out.println(temp.getData());
    }

    boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.getNext()!= null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
