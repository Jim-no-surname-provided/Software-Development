public class Field {

	private int height;
	private int width;

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	private int coveredShips;
	private Cell[][] cells;

	public Field(int height, int width, int nShips) {

		this.height = height;
		this.width = width;
		coveredShips = nShips * 2;

		cells = new Cell[height][width];

		for (int row = 0; row < cells.length; row++) {
			for (int col = 0; col < cells[row].length; col++) {

				cells[row][col] = new Cell();

			}
		}
	}

	public boolean hit(int row, int col) {
		cells[row][col].uncover();

		boolean isShip = cells[row][col].isShip();

		if (isShip)
			coveredShips--;

		return isShip;
	}

	public void print() {

		printColNumbers();

		// print rows
		for (int row = 0; row < cells.length; row++) {

			Out.print(row + "|");

			for (int col = 0; col < cells[row].length; col++) {
				Out.print(cells[row][col]);
			}

			Out.println("|" + row);

		}

		printColNumbers();
	}

	private void printColNumbers() {
		Out.print("  ");

		for (int col = 0; col < width; col++)
			Out.print(col);

		Out.println();
	}

	public void putShip(int row, int col) {
		cells[row][col].putShip();
	}

	public boolean isShip(int row, int col) {
		return cells[row][col].isShip();
	}

	public int getCoveredShips() {
		return coveredShips;
	}

	public boolean isGameOver() {
		return coveredShips == 0;
	}

	public boolean isCovered(int row, int col) {
		return cells[row][col].isCovered();
	}

}
