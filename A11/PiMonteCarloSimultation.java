public class PiMonteCarloSimultation implements Runnable {
    private int n = 0;
    private int c = 0;

    public int getC() {
        return c;
    }

    public int getN() {
        return n;
    }

    public double getPiEstimate() {
        return 4.0 * c / n;
    }

    @Override
    public void run() {
        while(!Stopper.stopped){
            n++;

            double x = Math.random();
            double y = Math.random();

            if(x*x + y*y <= 1){
                c++;
            }
        }

    }
}
