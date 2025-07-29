package LinkedList.mediumL;
import java.util.Stack;
class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseLL {
    public static Node reverseLL(Node head){
        //brute
//        Node temp=head;
//        Stack <Integer> stack = new Stack<>();
//
//        while(temp!=null){
//            stack.push(temp.data);
//            temp=temp.next;
//        }
//        temp=head;
//        while(temp!=null){
//            temp.data=stack.pop();
//            temp=temp.next;
//        }
//
//        return head;
        //optimal
//        Node temp=head;
//        Node prev=null;
//
//        while(temp!=null){
//            Node front=temp.next;
//            temp.next=prev;
//            prev=temp;
//            temp=front;
//
//        }
//
//        return prev;
        //optimal 2
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseLL(head.next);
        Node front= head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args) {
        Node head= new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
    }
}
