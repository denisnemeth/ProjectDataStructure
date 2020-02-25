package sk.itsovy.nemethd.main;

import sk.itsovy.nemethd.Exception.QueueOverflowException;
import sk.itsovy.nemethd.Exception.QueueUnderflowException;
import sk.itsovy.nemethd.Exception.StackOverflowException;
import sk.itsovy.nemethd.Exception.StackUnderflowException;
import sk.itsovy.nemethd.linkedList.LinkedList;
import sk.itsovy.nemethd.linkedList.Node;
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

        /*Queue<Integer> queue1 = new Queue<>(3);
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
        System.out.println(queue1.isFull());*/

        Node<String> node0 = new Node("Denis0");
        Node<String> node1 = new Node("Denis1");
        Node<String> node2 = new Node("Denis2");
        Node<String> node3 = new Node("Denis3");
        Node<String> node4 = new Node("Denis4");
        Node<String> node5 = new Node("Denis5");
        Node<String> node6 = new Node("Denis6");
        System.out.println(node2.getData());
        node0.setNext(node1);
        System.out.println(node0.getNext().getData());
        System.out.println();

        LinkedList linkedListString = new LinkedList();
        linkedListString.addToFront(node6);
        linkedListString.addToFront(node5);
        linkedListString.addToFront(node2);
        linkedListString.addToFront(node1);
        linkedListString.addToFront(node0);
        linkedListString.addToEnd(node4);
        linkedListString.add(node3, 2);
        linkedListString.print();
        System.out.println();
        //linkedListString.removeAll();
        linkedListString.remove(node1);
        linkedListString.remove(linkedListString.findByName("Denis5"));
        linkedListString.print();
        System.out.println();
        System.out.println(linkedListString.findByName("Denis6"));
        System.out.println(node4.getNext());
        System.out.println(linkedListString.getSize());
    }
}
