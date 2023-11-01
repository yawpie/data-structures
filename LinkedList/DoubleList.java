package LinkedList;

public class DoubleList {
    Node head = null;
    Node tail = null;

    public void addFirst(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("list kosong");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ", ");

            current = current.next;
        }
        System.out.println();

    }
}
