package StacksQueues.Learning.StackImplementation;
import java.util.Stack;
public class usingBuiltin {
    public static void main(String[] args) {
        Stack<Integer>  stack= new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        //peek
        System.out.println("peek:  "+stack.peek());//30

        //pop
        stack.pop();
        System.out.println("after pop :  " +stack);

        // Check empty
        System.out.println("Check empty:  "+ stack.isEmpty());
    }
}
