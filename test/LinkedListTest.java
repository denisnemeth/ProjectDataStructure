import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.nemethd.linkedList.LinkedList;
import sk.itsovy.nemethd.linkedList.Node;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @BeforeEach
    void setUp() {
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    void add() {
        /*LinkedList linkedList = new LinkedList();
        Node<String> node1 = new Node<>("Test node 1");
        Node<String> node2 = new Node<>("Test node 2");
        Node<String> node3 = new Node<>("");
        Node<Integer> node4 = new Node<>(10);
        Node<Date> node5 = new Node<>(new Date());
        Node<String> node6 = new Node<>(null);
        assertEquals(0, linkedList.getSize(), "Has to be 0");
        linkedList.addToFront(node1);
        assertNotNull(linkedList.findByName("Test node 1"));
        //assertNull(linkedList.findByName("Test node 2"));
        linkedList.addToFront(node6);
        linkedList.add(null, 1);
        linkedList.addToFront(null);
        linkedList.addToEnd(null);
        assertEquals(2, linkedList.getSize(), "Has to be 2");
        linkedList.addToFront(node5);
        assertEquals(node5, linkedList.getHead());
        linkedList.addToFront(node6);
        assertNotEquals(node5, linkedList.getHead());
//        linkedList.addToEnd(node4);
//        Node temp = linkedList.getHead();
//        while (temp.getNext() != null) temp = temp.getNext();
//        assertEquals(node4, temp);*/
    }
    @Test
    void print() {
    }
    @Test
    void remove() {
        LinkedList linkedList = new LinkedList();
        Node<String> node1 = new Node<>("Test node 1");
        Node<String> node2 = new Node<>("Test node 2");
        Node<String> node3 = new Node<>("Test node 3");
        Node<String> node4 = new Node<>("Test node 4");
        Node<String> node5 = new Node<>("Test node 5");
        Node<String> node6 = new Node<>("Test node 6");
        linkedList.addToFront(node1);
        linkedList.addToFront(node2);
        linkedList.addToFront(node3);
        linkedList.addToFront(node4);
        linkedList.addToFront(node5);
        linkedList.remove(node1);
        linkedList.remove(node1);
        assertEquals(4, linkedList.getSize());
        linkedList.remove(node6);
        linkedList.remove(null);
        assertEquals(4, linkedList.getSize());
        linkedList.removeAll();
        linkedList.removeAll();
        linkedList.remove(node3);
        assertEquals(0, linkedList.getSize());
    }
    @Test
    void removeAll() {
    }
    @Test
    void findByName() {
    }
    @Test
    void getSize() {
        /*LinkedList linkedList = new LinkedList();
        assertEquals(0, linkedList.getSize(), "Has to be 0");
        Node<String> node1 = new Node<>("Test node 1");
        Node<String> node2 = new Node<>("Test node 2");
        Node<String> node3 = new Node<>("Test node 3");
        linkedList.addToFront(node1);
        assertEquals(1, linkedList.getSize(), "Has to be 1");
        linkedList.addToEnd(node2);
        assertEquals(2, linkedList.getSize(), "Has to be 2");
        linkedList.add(node3, 2);
        assertEquals(3, linkedList.getSize(), "Has to be 3");
        linkedList.remove(node3);
        assertEquals(2, linkedList.getSize(), "Has to be 2");
        linkedList.removeAll();
        assertEquals(0, linkedList.getSize(), "Has to be 0");*/
    }
}