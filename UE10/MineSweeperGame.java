
public class MineSweeperGame {

    MineField field;
    boolean isAlive;

    int width;
    int heigth;
    int nMines;

    public MineSweeperGame(int width, int heigth, int nMines) {
        field = new MineField(width, heigth, nMines);
    }

    public void run() {
        isAlive = true;

        while (isAlive && !field.gameOver()) {
            field.print();
            Point target = readTarget(); // target has row and col

            isAlive = field.uncover(target.row, target.col); // Gives true if not mine
        }

        printEndText();
    }

    private Point readTarget() {
        int row = readNumber("Row: ", 0, field.getHeight() - 1); // prompt, lowerBound, upperBound
        int col = readNumber("Width: ", 0, field.getWidth() - 1);

        while (field.isUncovered(row, col)) {
            Out.println("Cell was already uncovered! Repeat data input.");
            row = readNumber("Row: ", 0, field.getHeight() - 1);
            col = readNumber("Width: ", 0, field.getWidth() - 1);

        }

        return new Point(row, col);
    }

    private int readNumber(String prompt, int lowerBound, int upperBound) {
        // TODO: copy

        Out.print(prompt);

        int result = In.readInt();
        Out.print("");

        return result;
    }

    private void printEndText() {

        if (isAlive) {
            Out.println("Congrats, you won!!");
        } else {
            Out.println("Sorry, R.I.P.");
        }

    }
}
