package app;

import java.util.Arrays;

import animals.*;
import io.Out;

public class Main {
    public static void main(String[] args) {
        final Dog rex = new CityDog("Rex", 7);

        Dog[] dogArray = new Dog[] {
                new CityDog("Nombre genérico 1", 5),
                new CityDog("Nombre genérico 2", 55),
                new CityDog("Nombre genérico 3", 7)
        };

        Arrays.sort(dogArray);

        for (Dog dog : dogArray) {
            Out.println(dog);
        }

        Out.println(rex);
        concert(rex);
    }

    public static void concert(Animal a) {
        for (int i = 0; i < 25; i++) {
            a.makeSound();
        }
    }
}
