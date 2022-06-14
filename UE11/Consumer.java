public class Consumer implements Runnable {
    Stack stack;

    public Consumer(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        boolean running = true;

        while (running) {
            
            try {
                Out.println("Popped " + stack.pop());
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
