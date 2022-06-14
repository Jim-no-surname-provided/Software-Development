
public class FieldCell {

    static final String COVERED_STRING  = "*";
    static final String WATER_STRING    = "o";
    static final String SHIP_STRING     = "x";
    
    private boolean isShip = false;
    private boolean isCovered = true;

    public void placeShip() {
        isShip = true;
    }

    public boolean isShip() {
        return isShip;
    }

    /**
     * Returns true if the cell was a hit.
     */
    public boolean unCover() {
        isCovered = false;
        return isShip;
    }

    @Override
    public String toString() {
        if(isCovered) return COVERED_STRING;

        if(isShip) return SHIP_STRING;

        /// unscovered and not ship
        return WATER_STRING;
        
    }

    public boolean isCovered() {
        return isCovered;
    }

}
