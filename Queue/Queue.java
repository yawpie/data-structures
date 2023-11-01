package Queue;

public class Queue {
    Node first = null;
    int size = 0;

    public void enqueue(int data) {
        Node newNode = new Node(data);
        Node current = first;
        if (first == null) {
            first = newNode;
            size++;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public int dequeue() {
        Node current = first;
        first = first.next;
        size--;
        return current.data;
    }

    public int front() {
        return first.data;
    }
}
