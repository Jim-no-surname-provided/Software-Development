package download;
public class MineSweeperApplication {

	public static void main(String[] args) {
		// set number of rows, columns and mines of minefield
		int numRows = 3;
		int numCols = 3;
		int numMines = 2;

		MineSweeperGame ms = new MineSweeperGame(numRows, numCols, numMines);
		ms.run();
	}
}
