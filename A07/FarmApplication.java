public class FarmApplication {
    public static void main(String[] args) {
        
        Farm farm = new Farm("Helmut", "St. Poelten");
        Stable stable1 = new Stable(1, farm);
        Stable stable2 = new Stable(2, farm);

        Animal geronimo = new Animal("Geronimo", stable1, 5.0);
        Animal marco = new Animal("Marco", stable2);
        Animal bruce = new Animal("Bruce");

        geronimo.print();
        marco.print();
        bruce.print();

        changeFoodRationOf(geronimo, -2);
        changeFoodRationOf(marco, -2);

    }

    public static void changeFoodRationOf(Animal animal, double delta) {
        Out.println(String.format("Trying to change the food ration of %s by -2kg...", animal.name));
        if (animal.changeFoodRation(-2))
            Out.println("Done.");
        else
            Out.println("It failed. They eat already very little.");
        
        Out.println("");

    }

}
