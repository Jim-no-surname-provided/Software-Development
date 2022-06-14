public class Stack {
    static int[] data = new int[10];
    static int top = -1;

    void put(int x) throws InterruptedException {
        synchronized (data) {
            while (top == data.length - 1) {
                Out.println("Wait for put...");
                data.wait();
            }

            top++;
            data[top] = x;
            data.notifyAll();
        }
    }

    int pop() throws InterruptedException {
        synchronized (data) {
            while (top < 0) {
                Out.println("Wait for pop...");
                data.wait();
            }
            int result = data[top];
            top--;
            data.notifyAll();
            return result;
        }
    }

}
