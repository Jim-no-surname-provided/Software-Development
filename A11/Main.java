public class Main {

    public static void main(String[] args) throws InterruptedException {

        PiMonteCarloSimultation[] simulations = new PiMonteCarloSimultation[10];
        Thread[] threads = new Thread[10];

        Out.println("Starting 10 threads, each performing a monte carlo simulation ...");
        for (int i = 0; i < threads.length; i++) {
            simulations[i] = new PiMonteCarloSimultation();
            threads[i] = new Thread(simulations[i]);
            threads[i].start();
        }

        Out.println("Starting Stopper thread ...");
        Thread stopper = new Thread(new Stopper());
        stopper.start();
        Out.println("Waiting via .join() until Stopper thread generates a random number >= 0.99 ...");
        stopper.join();
        Out.println("Stopper thread joined ...");

        Out.println("Waiting via .join() for all simulation threads to finish ...");
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        Out.println("All simulation threads joined ...");

        for (int i = 0; i < threads.length; i++) {
            Out.println(String.format("Estimated pi of simulation #%d: %s (%s * %s / %s)",
                    i,
                    simulations[i].getPiEstimate(),
                    4.0, // Bc of the formula
                    simulations[i].getC(),
                    simulations[i].getN()));
        }

        double totalN = 0;
        double totalC = 0;
        for (PiMonteCarloSimultation simulation : simulations) {
            totalN += simulation.getN();
            totalC += simulation.getC();
        }

        Out.println();
        double totalPi = 4.0 * totalC / totalN;
        Out.println(String.format("Overall estimated pi: %s (%s * %s / %s)",
                totalPi,
                4.0,
                totalC,
                totalN));
    }
}
