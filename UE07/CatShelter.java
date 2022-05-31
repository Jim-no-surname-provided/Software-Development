public class CatShelter {
    public static final int MAX_CATS = 10;
    public Cat[] cats;
    public int pos;

    public CatShelter() {
        this.cats = new Cat[MAX_CATS];
        this.pos = 0;
    }

    public boolean add(Cat cat) {
        if (pos >= cats.length)
            return false;

        cats[pos] = cat;
        pos++;
        return false;

    }

    public void print() {
        for (int i = 0; i < pos; i++) {
            Cat cat = cats[i];
            Out.println(String.format("%s is %s", cat.name, cat.hungry ? "hungry" : "satisfied"));
        }
    }

    public void feedAll(){
         for (int i = 0; i < pos; i++) {
            cats[i].eat();
        }
    }

}
