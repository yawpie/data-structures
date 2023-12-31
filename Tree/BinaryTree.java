package Tree;

public class BinaryTree {
    Node root = null;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    // method rekursif buat insert
    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;

    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }
        if (key > root.key) {
            return searchRec(root.right, key);
        }
        return searchRec(root.left, key);

    }

    // prefix traversal
    public void print() {
        printRec(root);
    }

    private void printRec(Node in) {
        System.out.println(in.key);
        if (in.left != null) {
            printRec(in.left);
        }
        if (in.right != null) {
            printRec(in.right);
        }
        return;
    }
}
