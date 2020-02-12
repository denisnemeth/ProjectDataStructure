package sk.itsovy.nemethd.main;

import sk.itsovy.nemethd.Exception.QueueOverflowException;
import sk.itsovy.nemethd.Exception.QueueUnderflowException;
import sk.itsovy.nemethd.Exception.StackOverflowException;
import sk.itsovy.nemethd.Exception.StackUnderflowException;
import sk.itsovy.nemethd.queue.Queue;
import sk.itsovy.nemethd.stack.Stack;

public class Main {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException, QueueOverflowException, QueueUnderflowException {

        /*Stack<Integer> stack1 = new Stack<>(3);
        System.out.println(stack1.getCapacity());
        stack1.push(1);
        stack1.push(2);
        stack1.pop();
        stack1.push(3);
        stack1.pop();
        stack1.push(4);
        stack1.push(5);
        System.out.println(stack1.getSize());
        System.out.println(stack1.topAndPop());
        System.out.println(stack1.top());
        stack1.empty();
        System.out.println(stack1.top());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.isFull());*/

        Queue<Integer> queue1 = new Queue<>(3);
        System.out.println(queue1.getCapacity());
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.dequeue();
        queue1.enqueue(3);
        queue1.dequeue();
        queue1.enqueue(4);
        queue1.enqueue(5);
        System.out.println(queue1.getSize());
        System.out.println(queue1.frontAndDequeue());
        System.out.println(queue1.front());
        queue1.empty();
        System.out.println(queue1.front());
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.isFull());
    }
}
