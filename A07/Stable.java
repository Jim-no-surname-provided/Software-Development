public class Stable {
    int nr;
    Farm farm;

    public Stable(int nr, Farm farm) {
        this.nr = nr;
        this.farm = farm;
    }

    @Override
    public String toString() {
        return String.format("Stable #%d of %s", nr, farm.toString());
    }
}
