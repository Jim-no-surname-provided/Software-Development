package download;
/**
 * An implementation of the Minesweeper game.
 */
public final class MineSweeperGame {
  private final MineField mineField;
  private boolean isPlayerAlive;

  public MineSweeperGame(int numRows, int numCols, int numMines) {
    mineField = new MineField(numRows, numCols, numMines);
  }

  public void run() {
    isPlayerAlive = true;

    do {
      mineField.print();
      Point p = readTarget();
      isPlayerAlive = mineField.uncoverCell(p.getY(), p.getX());
    } while (isPlayerAlive && mineField.nonMineCellsLeftToUncover());

    mineField.print();
    Out.println();

    printEndText();
  }

  private void printEndText() {
    if (isPlayerAlive) {
      Out.println("Congratulations, you found all mines!");
    } else {
      Out.println("R.I.P.");
    }
  }

  private Point readTarget() {
    int row = readNumber("Row: ", 0, mineField.getHeight() - 1);
    int col = readNumber("Column: ", 0, mineField.getWidth() - 1);

    while (!mineField.isCoveredCell(row, col)) {
      Out.println("Cell is already uncovered, choose another one.");
      row = readNumber("Row: ", 0, mineField.getHeight() - 1);
      col = readNumber("Column: ", 0, mineField.getWidth() - 1);
    }

    return new Point(col, row);
  }

  /**
   * Read a number in a given range from the console. The user is displayed a
   * message to enter a number and informed of the range of valid numbers. In case
   * of invalid user input this query is repeated until a valid number is entered.
   *
   * @param prompt     message to display before reading the number
   * @param lowerBound the smallest valid number
   * @param upperBound the highest valid number
   * @return the user-provided valid number
   */
  private static int readNumber(String prompt, int lowerBound, int upperBound) {
    int number;
    boolean isValidNumber = false;

    do {
      // prompt the user to enter something
      Out.print(prompt);

      // read a number from the console+
      number = In.readInt();

      // handle invalid input
      if (!In.done()) {
        Out.println("Invalid input!");
        In.readLine(); // consume newline char
      } else if (number < lowerBound || number > upperBound) {
        Out.print(String.format("Number must be in [%d, %d]%n", lowerBound, upperBound));
      } else {
        isValidNumber = true;
      }
    } while (!isValidNumber);

    return number;
  }
}
