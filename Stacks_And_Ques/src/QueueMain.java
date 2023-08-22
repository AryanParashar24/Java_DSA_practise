public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);
        queue.insert(9);
        queue.insert(11);
        queue.insert(32);
        queue.insert(14);
        queue.insert(24);
        queue.insert(42);


        queue.display();

//        System.out.println(queue.remove());
//        queue.display();
    }
}
