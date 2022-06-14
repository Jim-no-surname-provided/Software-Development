public class MineSweeperApplication {
    public static void main(String[] args) {
        Out.println("Welcome");

        int heigth;
        int width;
        int nMines;

        Out.println("How many rows do you want?");
        heigth = getNumberFromUser();

        Out.println("How many columns do you want?");
        width = getNumberFromUser();

        Out.println("How many mines do you want?");
        nMines = getNumberFromUser();
        
        while(nMines > heigth * width){
            Out.println("Sorry, that's too much mines. There isn't enough space on the table!");
            nMines = getNumberFromUser();
        }
        

        MineSweeperGame game = new MineSweeperGame(width, heigth, nMines);
        game.run();
    }

    private static int getNumberFromUser() {
        int result = In.readInt();

        while (!In.done()) {
            In.readLine();
            Out.println("Sorry, that is not a valid number. Try again!");
            result = In.readInt();
        }

        return result;
    }
}
