package sk.itsovy.nemethd.queue;

import sk.itsovy.nemethd.Exception.QueueOverflowException;
import sk.itsovy.nemethd.Exception.QueueUnderflowException;
import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    private int size = 0;
    private int capacity;
    private List<T> list;

    public Queue(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
    }
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull() {
        return size==capacity;
    }
    public void enqueue(T obj) throws QueueOverflowException {
        if (obj == null) return;
        if (isFull()) {
            throw new QueueOverflowException("The queue is full!");
        } else {
            list.add(0, obj);
            size += 1;
        }
    }
    public void dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("The queue is empty!");
        } else {
            list.remove(size-1);
            size -= 1;
        }
    }
    public T front() {
        if (isEmpty()) return null;
        else return list.get(size-1);
    }
    public T frontAndDequeue() throws QueueUnderflowException {
        T obj = front();
        dequeue();
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
