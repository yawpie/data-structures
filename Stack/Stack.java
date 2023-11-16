package Stack;

public class Stack {
    Node top = null;
    private int length = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        length++;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public int pop() {
        int data = top.data;
        top = top.next;
        length--;
        return data;
    }

    public int peek() {
        return top.data;
    }

    public int length() {
        return length;
    }

    public void print() {
        Node copy = top;
        while (copy != null) {
            System.out.println(copy.data);
            copy = copy.next;

        }
    }

    public int size() {
        return length;
    }
}
