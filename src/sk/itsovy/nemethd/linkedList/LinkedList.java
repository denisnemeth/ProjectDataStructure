package sk.itsovy.nemethd.linkedList;

public class LinkedList {

    private Node head;

    public LinkedList () {
        this.head = null;
    }
    public void addToFront (Node node) {
        if (node == null) return;
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }
    public void addToEnd(Node node) {
        if (node == null) {
            return;
        }
        Node temp = head;
        while (temp.getNext() != null)
            temp = temp.getNext();
        temp.setNext(node);
    }
    public void add(Node node, int position) {
        if (node == null) return;
        if (position <= 0) { addToFront(node);
        } else if (position >= getSize()) { addToEnd(node);
        } else {
            Node temp = head;
            for (int i = 1; i < position; i++) temp = temp.getNext();
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }
    public void print () {
        if (head == null) {
            System.out.println("Linked List is empty, no items to print!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    public boolean remove (Node node) {
        if (head == null || node == null) return false;
        if (head == node) {
            head = node.getNext();
            return true;
        }
        Node temp = head;
        while (temp.getNext() != node) {
            temp = temp.getNext();
            if (temp == null) return false;
        }
        temp.setNext(temp.getNext().getNext());
        return true;
    }
    public void removeAll () { head = null; }
    public Node findByName (String name) {
        if (name == null || head == null) return null;
        Node temp = head;
        if (!(temp.getData() instanceof String)) return null;
        while (head != null) {
            if (temp.getData().equals(name)) return temp;
            temp = temp.getNext();
        }
        return null;
    }
    public int getSize () {
        int count = 0;
        Node temp = head;
        if (head == null) return 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    public Node getHead() {
        return head;
    }
}
