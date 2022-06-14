
public class GameField {

    FieldCell[][] cells;
    public int height;
    public int width;
    public boolean isGameOver;
    private int nCellsWithShips;
    private int discoveredShips;

    public GameField(int rows, int cols, int nShips) {

        this.height = rows;
        this.width = cols;
        this.nCellsWithShips = 2 * nShips;

        cells = new FieldCell[rows][cols];

        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[row][col] = new FieldCell();
            }
        }

        placeShips(nShips);
    }

    private void placeShips(int nShips) {
        for (int i = 0; i < nShips; i++) {
            int row;
            int col;

            do {
                row = (int) (Math.random() * height - 1);
                col = (int) (Math.random() * width);
            } while (cells[row][col].isShip() && cells[row + 1][col].isShip());

            cells[row][col].placeShip();
            // The one bellow bc the ship is 2x height
            cells[row + 1][col].placeShip();
        }
    }

    public boolean isGameOver() {
        return discoveredShips >= nCellsWithShips;
    }

    public void unCover(int row, int col) {
        if (cells[row][col].unCover()) {
            discoveredShips++;
            Out.println("Hit!");

        }
    }

    public void print() {
        
        Out.print("  ");
        for (int col = 0; col < width; col++) {
            Out.print(col);
        }
        Out.println();

        for (int row = 0; row < height; row++) {
            Out.print(row + "|");

            for (int col = 0; col < width; col++) {
                Out.print(cells[row][col]);
            }

            Out.print("|" + row);

            Out.println();
        }

        Out.print("  ");
        for (int col = 0; col < width; col++) {
            Out.print(col);
        }
        Out.println();

    }

    public boolean isCovered(int row, int col) {
        return cells[row][col].isCovered();
    }
}
