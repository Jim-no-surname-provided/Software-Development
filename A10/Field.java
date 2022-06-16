public class Field {

	private int coveredShips;
	private Cell[][] cells = new Cell[4][4];

	public Field(int nShips) {
		coveredShips = nShips * 2;

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

		Out.println("  0123");

		// print rows
		for (int row = 0; row < cells.length; row++) {

			Out.print(row + "|");

			for (int col = 0; col < cells[row].length; col++) {
				Out.print(cells[row][col]);
			}

			Out.println("|" + row);

		}

		Out.println("  0123");
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
