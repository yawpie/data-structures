package LinkedList;

public class Circular {
    Node head = null;

    public void addBegin(int number) {
        Node newNode = new Node(number);
        Node copy = head;
        if (head == null) {
            newNode.next = head;
            head = newNode;
            head.next = head;
            return;
        }
        while (copy.next != head) {
            copy = copy.next;
        }
        copy.next = newNode;
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int number) {
        Node newNode = new Node(number);
        Node copy = head;
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        while (copy.next != head) {
            copy = copy.next;
        }
        copy.next = newNode;
        newNode.next = head;
    }

    public void print() {
        if (head == null) {
            System.out.println("list kosong");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + ", ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
