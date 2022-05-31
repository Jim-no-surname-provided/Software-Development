
public class StableException extends FarmException {
    private Stable stable;

    public StableException(Stable stable, String msg) {
        super(msg);
        this.stable = stable;
    }

    public Stable getStable() {
        return stable;
    }
}