public class Printer implements Runnable {

    @Override
    public void run() {
        boolean running = true;

        for (int i = 0; i < 10_000 && running; i++) {
            Out.println(String.format("%s: %,d",
                    Thread.currentThread().getName(),
                    i));
            try {
                Thread.sleep(5_000_000);
            } catch (InterruptedException e) {
                running = false;
            }

            if (Thread.interrupted()) {
                running = false;
            }
        }
    }
}
