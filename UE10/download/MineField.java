package download;
/**
 * A playing field for the Minesweeper game.
 */
public final class MineField {

  /**
   * The number of rows on the field.
   */
  private final int height;

  /**
   * The number of columns on the field.
   */
  private final int width;

  /**
   * The number of placed mines
   */
  private final int numMines;

  /**
   * The number of uncovered cells;
   */
  private int numUncovered;

  /**
   * The actual minefield. Its dimensions are specified by {@link #height} x
   * {@link #width}.
   */
  private final MineFieldCell[][] cells;

  /**
   * Constructor initializing a minefield with randomly placed mines.
   *
   * @param width    the number of columns in the field
   * @param height   the number of rows in the field
   * @param numMines the number of randomly placed mines in the field
   * @throws IllegalArgumentException if the number of mines is greater than the number of cells
   */
  public MineField(int width, int height, int numMines) {
    if (numMines > width * height) {
      throw new IllegalArgumentException(
        "number of mines must not be larger than number of cells");
    }
    this.width = width;
    this.height = height;
    this.numMines = numMines;
    this.numUncovered = 0;

    cells = new MineFieldCell[height][width];

    for (int row = 0; row < height; row++) {
      for (int col = 0; col < width; col++) {
        cells[row][col] = new MineFieldCell();
      }
    }
    placeMines();
  }

  /**
   * Places mines at random locations on the field.
   */
  private void placeMines() {
    for (int i = 0; i < numMines; i++) {
     placeMine();
    }
  }

  /**
   * Places a mine at random locations on the field.
   */
  private void placeMine() {
    // try to set the mine, repeat if the field is already a mine
    int row, col;
    do {
      // find a random row and column
      row = (int) (Math.random() * height);
      col = (int) (Math.random() * width);
    } while (cells[row][col].isMine());

    cells[row][col].setMine();
    updateNeighborCounts(row, col);
  }

  private void updateNeighborCounts(int row, int col) {
    // update the number of neighboring mines in the adjacent fields
    for (int adjacentRow = row - 1; adjacentRow <= row + 1; adjacentRow++) {
      // only access in-bounds rows
      if (adjacentRow >= 0 && adjacentRow < height) {
        for (int adjacentCol = col - 1; adjacentCol <= col + 1; adjacentCol++) {
          // only access in-bounds columns
          if (adjacentCol >= 0 && adjacentCol < width) {
            // increment the counter only in neighboring cells
            if (adjacentRow != row || adjacentCol != col) {
              cells[adjacentRow][adjacentCol].addMineNeighbor();
            }
          }
        }
      }
    }
  }

  /**
   * Uncovers a cell on the field.
   *
   * @param row the row position of the cell to uncover
   * @param col the column position of the cell to uncover
   * @return {@code true} if a non-mine cell was uncovered, {@code false} if a mine was uncovered
   */
  public boolean uncoverCell(int row, int col) {
    cells[row][col].uncover();
    numUncovered++;
    return !isMineCell(row, col);
  }

  /**
   * Checks whether a cell on the field is covered.
   *
   * @param row the row position of the cell to check
   * @param col the column position of the cell to check
   * @return whether the cell at the specified location is covered
   */
  public boolean isCoveredCell(int row, int col) {
    return cells[row][col].isCovered();
  }

  /**
   * Checks whether a cell on the field contains a mine.
   *
   * @param row the row position of the cell to check
   * @param col the column position of the cell to check
   * @return whether the cell at the specified location contains a mine
   */
  private boolean isMineCell(int row, int col) {
    return cells[row][col].isMine();
  }

  /**
   * Check whether any more cells can be uncovered or not.
   *
   * @return {@code false} if all possible non-mine cells have been uncovered, otherwise {@code true}
   */
  public boolean nonMineCellsLeftToUncover() {
    return getSize() - numUncovered != numMines;
  }

  /**
   * Prints a visual display of the minefield.
   */
  public void print() {
    int padding = (int) (Math.log10(cells[0].length - 1) + 1);
    String frameFormat = "%" + padding + "d";
    String fieldFormat = "%" + padding + "s";

    // add some padding before printing column header
    for (int i = 0; i < padding; i++) Out.print(" ");
    Out.print(" ");

    // print the column header padded
    for (int col = 0; col < cells[0].length; col++) {
      Out.print(String.format(frameFormat, col));
      Out.print(" ");
    }
    Out.println();

    // print each row padded
    for (int row = 0; row < height; row++) {
      // print the row number
      Out.print(String.format(frameFormat, row));
      Out.print(" ");

      // print the cell contents
      for (int col = 0; col < width; col++) {
        Out.print(String.format(fieldFormat, cells[row][col]));
        Out.print(" ");
      }
      Out.println();
    }
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public int getSize() {
    return getHeight() * getWidth();
  }
}
