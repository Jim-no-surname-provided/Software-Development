
public class MineSweeperGame {

  MineField field;
  boolean isAlive;

  int width;
  int heigth;
  int nMines;

  public MineSweeperGame(int width, int heigth, int nMines) {
    field = new MineField(heigth, width, nMines);
  }

  public void run() {
    isAlive = true;

    while (isAlive && !field.gameOver()) {
      field.print();
      Point target = readTarget(); // target has row and col

      isAlive = field.uncover(target.row, target.col); // Gives true if not mine
    }

    field.print();
    printEndText();
  }

  private Point readTarget() {
    int row = readNumber("Row: ", 0, field.getHeight() - 1); // prompt, lowerBound, upperBound
    int col = readNumber("Col: ", 0, field.getWidth() - 1);

    while (field.isUncovered(row, col)) {
      Out.println("Cell was already uncovered! Repeat data input.");
      row = readNumber("Row: ", 0, field.getHeight() - 1);
      col = readNumber("Width: ", 0, field.getWidth() - 1);

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

  private void printEndText() {

    if (isAlive) {
      Out.println("Congrats, you won!!");
    } else {
      Out.println("Sorry, R.I.P.");
    }

  }
}
