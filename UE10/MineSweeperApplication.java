public class MineSweeperApplication {
    public static void main(String[] args) {
        // TODO allow the player to set size
        Out.println("Welcome");

        MineSweeperGame game = new MineSweeperGame(4, 4, 4);
        game.run();
    }
}
