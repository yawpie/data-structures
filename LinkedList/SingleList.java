package LinkedList;

public class SingleList {
    Node head = null;

    public void addLast(int number) {
        Node newNode = new Node(number);
        Node headCopy = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (headCopy.next != null) {
            headCopy = headCopy.next;
        }
        headCopy.next = newNode;
        return;
    }

    public void addFirst(int number) {
        Node newNode = new Node(number);
        newNode.next = head;
        head = newNode;
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
