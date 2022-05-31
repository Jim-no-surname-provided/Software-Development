public class Animal {
    public String name;
    public Stable stable;
    public double foodPerDay;

    public Animal(String name, Stable stable, double foodPerDay) {
        this.name = name;
        this.stable = stable;
        this.foodPerDay = foodPerDay;
    }

    public Animal(String name, Stable stable) {
        this(name, stable, 0.1);
    }

    public Animal(String name) {
        this(name, null);
    }

    public void print() {
        if (stable != null)
            Out.println(String.format("Animal %s is in the %s", name, stable));
        else
            Out.println(String.format("Animal %s has no Stable", name));

        Out.println(String.format("Daily food: %skg\n", foodPerDay));
    }

    public boolean changeFoodRation(double delta) {
        double newRation = foodPerDay + delta;

        if(newRation > 0){
            foodPerDay = newRation;
            return true;
        }

        return false;
    }
}
