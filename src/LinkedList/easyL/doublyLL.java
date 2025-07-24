package LinkedList.easyL;

public class doublyLL {
    class DoublyLinkedList{
        Node head;

        class Node{
            int data;
            Node prev, next;

            Node(int data){
                this.data=data;
                prev = next =null;
            }
        }

        void insertAtEns(int data){
            Node newNode =new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public static void main(String[] args) {

    }
}
