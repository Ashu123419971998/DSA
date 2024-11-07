package dataStructures.Queue;

public class Main {
    public static void main(String args[]) {
        Queue queue = new Queue(1);
        queue.print();
        queue.enqueue(3);
        queue.print();
        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue());
    }
}
