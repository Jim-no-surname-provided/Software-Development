public class Threads {

    public static int N = 10;

    public static void main(String[] args) throws InterruptedException {
        Printer p = new Printer();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        // t1.join();
        // t2.join();

        Thread.sleep(250);
        Out.println(Thread.currentThread().getName());
    }
}
