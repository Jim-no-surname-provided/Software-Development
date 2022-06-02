
public class MineField {

    MineFieldCell[][] cells;
    int heigth;
    int width;
    int nMines;

    int nUncovered;

    public MineField(int cols, int rows, int nMines) {
        heigth = rows;
        width = cols;
        this.nMines = nMines;
    

        cells = new MineFieldCell[cols][rows];

        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[col][row] = new MineFieldCell();
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
            row = (int) (Math.random() * heigth);
            col = (int) (Math.random() * width);
        } while (cells[row][col].isMine());

        cells[row][col].setMine();

        updateNeighborCounts(row, col);
    }

    private void updateNeighborCounts(int row, int col) {
        // TODO: copy
    }

    public boolean uncover(int row, int col){
        nUncovered++;
        cells[row][col].uncover();
        return !cells[row][col].isMine();
    }

    public boolean isUncovered(int row, int col) {
        return cells[row][col].isUncovered();
    }

    public int getHeight() {
        return heigth;
    }

    public int getWidth() {
        return width;
    }

    public boolean gameOver() {
        return width * heigth <= nUncovered;
    }

    public void print() {
        //TODO: copy
    }
}
