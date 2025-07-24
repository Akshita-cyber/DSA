package LinkedList.easyL;

public class implementation {
     static class Node{
         int data;
         Node next;

         Node(int data1){
             this.data=data1;
             this.next=null;
         }
    }
    static class LinkedList {
        Node head;

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }

        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Insert at a specific position (0-based index)
        public void insertAt(int data, int index) {
            Node newNode = new Node(data);

            if (index == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                if (temp == null) throw new IndexOutOfBoundsException("Index out of range");
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

        }

        // Delete a node by value
        public void delete(int data) {
            if (head == null) return;
            if (head.data == data) {
                head = head.next;
                return;
            }
            Node temp = head;
            while (temp.next != null && temp.next.data != data) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(5);
        list.insertAtEnd(4);
        list.insertAtEnd(12);
        list.insertAt(20,1);

        list.display();
        list.delete(20);
        list.display();
    }
}
