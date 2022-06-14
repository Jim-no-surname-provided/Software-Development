public class RaceCondition implements Runnable {
    static int sharedVar = 0;

    private int localVar = 0;

    public static Object MONITOR = new Object(); // You can have as many monitors as you want

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            inc();
            localVar++;
            // printProgressed();
        }

        Out.println("Local var: " + localVar);
    }

    private static void inc() {
        synchronized (MONITOR) {
            sharedVar++;
        }
    }
}
