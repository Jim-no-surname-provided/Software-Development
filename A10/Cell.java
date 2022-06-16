public class Cell {
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
            return "*";

        /// its not covered
        /// we can see it

        if (isShip)
            return "x";

        /// its not covered and its not ship

        return "o";

    }
}
