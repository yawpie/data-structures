package LinkedList;

public class Driver {

    public static void main(String[] args) {
        SingleList single = new SingleList();
        single.addFirst(0);
        single.addFirst(1);
        single.addFirst(2);
        single.addLast(1);
        single.addLast(2);
        single.addLast(3);
        System.out.println("single");
        single.print();
        System.out.println("---");

        Circular circle = new Circular();
        circle.addBegin(0);
        circle.addBegin(1);
        circle.addLast(10);
        circle.addLast(12);
        System.out.println("circular");
        circle.print();
        System.out.println("---");

        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(0);
        doubleList.addFirst(1);
        doubleList.addFirst(2);
        doubleList.addLast(12);
        doubleList.addLast(13);
        doubleList.addLast(14);
        System.out.println("double");
        doubleList.print();

        System.out.println("---");
    }
}