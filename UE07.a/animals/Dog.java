package animals;
public abstract class Dog implements Animal, Comparable<Dog> {
    public final String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("The dog %s at the age of %d years old", name, age);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (getClass() == other.getClass()) {
            Dog otherD = (Dog) other;

            return otherD.name.equals(name) &&
                    age == otherD.age;

        }
        return false;
    }

    @Override
    public int compareTo(Dog other) {
        return age - other.age;
    }
}