package Stack;

public class Stack {
    Node top = null;
    int size = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public int peek() {
        return top.data;
    }

    public void print() {
        Node copy = top;
        while (copy != null) {
            System.out.println(copy.data);
            copy = copy.next;

        }
    }

    public int size() {
        return size;
    }
}
