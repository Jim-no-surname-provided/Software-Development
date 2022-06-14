public class Producer implements Runnable {
    Stack stack;

    public Producer(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        boolean running = true;

        while (running) {
            try {
                stack.put(10);
                Out.println("Produced");
                Thread.sleep((int) Math.random() * 100);
            } catch (InterruptedException e) {
                running = false;
            }

            if (Thread.interrupted()) {
                running = false;
            }

        }
    }
}
