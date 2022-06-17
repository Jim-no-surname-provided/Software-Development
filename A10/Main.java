public class Main {

    static final int HEIGHT = 4;
    static final int WIDTH = 4;
    static final int MAX_NSHIPS = 4;

    public static void main(String[] args) {

        Out.println("How many ships are they going to be?");
        int nShips = receiveInt(1, MAX_NSHIPS);

        BattleshipGame game = new BattleshipGame(WIDTH, HEIGHT, nShips);

        game.run();
    }

    public static int receiveInt(int underLimit, int upperLimit) {

        int result = In.readInt();

        while (!In.done() || result < underLimit || result > upperLimit) {
            In.readLine();
            Out.println(String.format("It must be between %d and %d!", underLimit, upperLimit));
            result = In.readInt();
        }

        return result;
    }
}