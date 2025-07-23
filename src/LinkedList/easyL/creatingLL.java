package LinkedList.easyL;
class Node{
    int data;
    Node next;

    public Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }

    public Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class creatingLL {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        Node x=new Node(arr[0]);
        Node y=x;
        System.out.println(x.data);
        System.out.println(x.next);
        System.out.println(y);
    }
}
