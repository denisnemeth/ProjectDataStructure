package sk.itsovy.nemethd.linkedList;

public class Node <T> {

    private T data;
    private Node next;

    public Node (T n) {
        data = n;
        next = null;
    }
    public T getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
