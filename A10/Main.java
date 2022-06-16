public class Main {
    public static void main(String[] args) {

        Out.println("How many ships are they going to be?");
        int nShips = receiveInt(1, 4);

        BattleshipGame game = new BattleshipGame(nShips);

        game.run();
    }

    public static int receiveInt(int underLimit, int upperLimit) {

        int result = In.readInt();

        while (!In.done() || result < underLimit || result > upperLimit ) {
            In.readLine();
            Out.println(String.format("It must be between %d and %d!", underLimit, upperLimit));            
            result = In.readInt();
        }

        return result;
    }
}