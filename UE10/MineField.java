
public class MineField {

  MineFieldCell[][] cells;
  int height;
  int width;
  int nMines;

  int nUncovered;

  public MineField(int rows, int cols, int nMines) {
    height = rows;
    width = cols;
    this.nMines = nMines;

    cells = new MineFieldCell[rows][cols];

    for (int row = 0; row < cells.length; row++) {
      for (int col = 0; col < cells[row].length; col++) {
        cells[row][col] = new MineFieldCell();
      }
    }

    placeMines();
  }

  private void placeMines() {
    for (int i = 0; i < nMines; i++) {
      placeMine();
    }

  }

  private void placeMine() {
    int row;
    int col;

    do {
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

  public boolean uncover(int row, int col) {
    nUncovered++;
    cells[row][col].uncover();
    return !cells[row][col].isMine();
  }

  public boolean isUncovered(int row, int col) {
    return cells[row][col].isUncovered();
  }

  public int getHeight() {
    return height;
  }

  public int getWidth() {
    return width;
  }

  public boolean gameOver() {
    return width * height <= nUncovered + nMines;
  }

  public void print() {
    int padding = (int) (Math.log10(cells[0].length - 1) + 1);
    String frameFormat = "%" + padding + "d";
    String fieldFormat = "%" + padding + "s";

    // add some padding before printing column header
    for (int i = 0; i < padding; i++)
      Out.print(" ");
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

}
