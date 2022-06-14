public class Battleship {

    static final int HEIGHT = 4;
    static final int WIDTH = 4;

    public static void main(String[] args) {

        Out.println("Welcome to Battleship!");
        Out.println("How many ships are there going to be?");
        int nShips = In.readInt();

        while (!In.done() || nShips < 0 || nShips > 4) {
            Out.println("Sorry, that is not a valid number.");
            if (In.done()) {
                Out.println("You can only make between 0 and 4 ships.");
            }

            In.readLine();
            nShips = In.readInt();
        }

        BattleshipGame game = new BattleshipGame(HEIGHT, WIDTH, nShips);

        game.run();
    }
}