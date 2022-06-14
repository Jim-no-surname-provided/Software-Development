package download;
/**
 * Class representing a single cell in a field of mines. The cell may contain a
 * mine, be covered, or be placed adjacent to any number of other cells
 * containing mines.
 */
public final class MineFieldCell {

	/**
	 * Whether this cell contains a mine.
	 */
	private boolean mine;

	/**
	 * Whether this cell is currently covered.
	 */
	private boolean covered;

	/**
	 * The number of neighboring cells containing mines.
	 */
	private int mineNeighbors;

	/**
	 * Constructor initializing an empty, covered cell with no neighboring mines.
	 */
	public MineFieldCell() {
		this.mine = false;
		this.covered = true;
		this.mineNeighbors = 0;
	}

	/**
	 * Whether a mine is set in this cell.
	 *
	 * @return whether the cell is a mine
	 */
	public boolean isMine() {
		return mine;
	}

	/**
	 * Sets a mine at this cell.
	 */
	public void setMine() {
		mine = true;
	}

	/**
	 * Returns the covering state of the cell.
	 *
	 * @return whether the cell is currently covered
	 */
	public boolean isCovered() {
		return covered;
	}

	/**
	 * Uncovers the cell.
	 */
	public void uncover() {
		covered = false;
	}

	/**
	 * Increments the number of neighboring mines.
	 */
	public void addMineNeighbor() {
		mineNeighbors++;
	}

	/**
	 * Returns how many adjacent fields have placed mines.
	 *
	 * @return the number of neighboring mines
	 */
	public int getMineNeighbors() {
		return mineNeighbors;
	}

	@Override
	public String toString() {
		if (covered) {
			return "#";
		} else if (mine) {
			return "M";
		} else {
			return String.valueOf(mineNeighbors);
		}
	}
}
