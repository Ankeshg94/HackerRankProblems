package com.ankesh.learning;

public class LinkedListCycleDetection {

        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            boolean loopPresent = false;
            while(fast!=null && fast.next !=null){
                slow= slow.next;
                fast = fast.next.next;
                if(slow==fast){
                    loopPresent = true;
                    break;
                }
            }
            if(!loopPresent){return null;}

            while(head!=slow){
                head=head.next;
                slow = slow.next;
            }
            return slow;
        }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }