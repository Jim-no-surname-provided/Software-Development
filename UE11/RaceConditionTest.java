public class RaceConditionTest {
    public static void main(String[] args) throws InterruptedException {
        RaceCondition rc1 = new RaceCondition();
        RaceCondition rc2 = new RaceCondition();

        Thread t1 = new Thread(rc1);
        Thread t2 = new Thread(rc2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Out.println(RaceCondition.sharedVar);
    }
}
