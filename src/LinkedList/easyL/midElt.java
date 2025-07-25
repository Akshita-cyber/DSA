package LinkedList.easyL; /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */import java.util.*;
class ListNode {
    // Data stored in the node
    int data;

    ListNode next;

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class midElt {
    public ListNode middleNode(ListNode head) {
        //brute force
        // if(head==null||head.next==null)return head;
        // int len=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     len++;
        //     temp=temp.next;
        // }
        // int mid=len/2+1;
        // temp=head;
        // for(int i=1;i<mid;i++){

        //     temp=temp.next;
        // }
        // return temp;

        //optimal

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}