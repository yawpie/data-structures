package Queue;

/**
 * The class Main is not a part of the data structure
 * but is a part for performing test on the data structures in order to make
 * sure it is correct
 */
public class Main {
    public static void main(String[] args) {
        Queue antri = new Queue();
        antri.enqueue(0);
        antri.enqueue(1);
        antri.enqueue(2);
        System.out.println(antri.size);
        while (antri.size != 0) {
            System.out.println(antri.dequeue());
        }
    }
}
