
public class MineFieldCell {

    private boolean isMine;
    public boolean isCovered = true;
    int nNeighbors = 0;

    public void setMine() {
        isMine = true;
    }

    public boolean isMine() {
        return isMine;
    }

    public void uncover() {
        isCovered = false;
    }

    public boolean isUncovered() {
        return !isCovered;
    }

    public void addMineNeighbor() {
        nNeighbors++;
    }

    @Override
    public String toString() {
        if (isCovered)
            return " ";
        if (isMine)
            return "X";

        return nNeighbors + "                                                                                                                                                                                                                                                                                                       ";
    }
}
