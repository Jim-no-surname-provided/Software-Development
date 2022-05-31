
public class StableFullException extends StableException {
    private int capacity;

    public StableFullException(Stable stable, int capacity, String msg) {
        super(stable, msg);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}