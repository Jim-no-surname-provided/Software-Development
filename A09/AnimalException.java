
public class AnimalException extends FarmException {

    private Animal animal;

    public AnimalException(Animal animal, String msg) {
        super(msg);
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }
}