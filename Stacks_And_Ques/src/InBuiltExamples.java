import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(6);
        stack.push(11);
        stack.push(12);
        stack.push(9);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());  Now if we would try to pop something out whih cisn't even present in the stack then it would give an error


        System.out.println("Now for queue");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(1);
        queue.add(7);
        queue.add(9);
        queue.add(5);

        System.out.println(queue.peek()); // will print the first one in the queue
        System.out.println(queue.remove()); // will remove the first one in the queue

        System.out.println("Now for Deque");

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(11);
        deque.add(22);
        deque.addLast(33);
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());

    }
}