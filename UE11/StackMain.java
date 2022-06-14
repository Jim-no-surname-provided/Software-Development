public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();

        Consumer c = new Consumer(stack);
        Producer p = new Producer(stack);

        Thread consumThread = new Thread(c);
        Thread producThread = new Thread(p);

        consumThread.start();
        producThread.start();
    }
}
