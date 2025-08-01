package StacksQueues.Learning.QueueImplementation;
import java.util.Queue;
import java.util.LinkedList;

public class usingBuiltIn {
    public static void main(String[] args) {
        Queue <Integer> q= new LinkedList<>();

        //enqueue
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);

        //peek
        System.out.println("q.peek()= "+ q.peek());

        //dequeue
        q.remove();
        System.out.println("after q.remove() {dequeue}:  "+ q);

        // Empty check
        System.out.println("Is empty? " + q.isEmpty());
    }
}
