
public class BattleshipGame {

  GameField field;

  public BattleshipGame(int height, int width, int nShips) {
    field = new GameField(height, width, nShips);
  }

  public void run() {

    while (!field.isGameOver()) {
      field.print();

      Point target = getTarget();

      field.unCover(target.row, target.col);
    }
    field.print();

    printEndText();
  }

  private void printEndText() {
    Out.println("Congratulations! You won.");
  }

  private Point getTarget() {

    int row = readNumber("Row: ", 0, field.height - 1);
    int col = readNumber("Column: ", 0, field.width - 1);

    while (!field.isCovered(row, col)) {
      Out.println("That cell was already uncovered! Take another one.");
      row = readNumber("Row: ", 0, field.height - 1);
      col = readNumber("Column: ", 0, field.width - 1);
    }
    return new Point(row, col);
  }

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
