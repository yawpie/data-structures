package Tree;

public class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.left = null;
        this.right = null;
        this.key = key;
    }
}
