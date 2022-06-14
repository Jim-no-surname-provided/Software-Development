public class Stopper implements Runnable {

    public static boolean stopped = false;

    @Override
    public void run() {
        while (!stopped) {

            double num = Math.random();

            if (Thread.interrupted() || num >= 0.99) {
                stopped = true;
            }

            // Out.println("Generated number : " + num);
            if (!stopped)
                try {
                    // Out.println("Waiting...");
                    Thread.sleep(100);
                } catch (Exception e) {
                    stopped = true;
                }
        }
    }
}