package sk.itsovy.nemethd.stack;

import sk.itsovy.nemethd.Exception.StackOverflowException;
import sk.itsovy.nemethd.Exception.StackUnderflowException;
import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private int size = 0;
    private int capacity;
    private List<T> list;

    public Stack(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
    }
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull() {
        return size==capacity;
    }
    public void push(T obj) throws StackOverflowException {
        if (obj == null) return;
        if (isFull()) {
            throw new StackOverflowException("The stack is full!");
        } else {
            list.add(obj);
            size += 1;
        }
    }
    public void pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("The stack is empty!");
        } else {
            list.remove(size-1);
            size -= 1;
        }
    }
    public T top() {
        if (isEmpty()) return null;
        else return list.get(size-1);
    }
    public T topAndPop() throws StackUnderflowException {
        T obj = top();
        pop();
        return obj;
    }
    public void empty() {
        list.clear();
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
