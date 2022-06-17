public class Cell {

    final String COVERED_STRING = "*";
    final String WATER_STRING = "o";
    final String SHIP_STRING = "x";

    private boolean isShip = false;
    private boolean isCovered = true;

    public boolean isShip() {
        return isShip;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public void putShip() {
        isShip = true;
    }

    public void uncover() {
        isCovered = false;
    }

    @Override
    public String toString() {
        if (isCovered)
            return COVERED_STRING;

        /// its not covered
        /// we can see it

        if (isShip)
            return SHIP_STRING;

        /// its not covered and its not ship

        return WATER_STRING;

    }
}
