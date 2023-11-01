package Stack;

/**
 * The class Main is not a part of the data structure
 * but is a part for performing test on the data structures in order to make
 * sure it is correct
 */
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.print();
        s.pop();
        System.out.println("tes pop");
        s.print();
        System.out.println("tes peek");
        System.out.println(s.peek());
    }
}
