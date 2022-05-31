package animals;

import io.Out;

public class CityDog extends Dog {

    public CityDog(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        Out.println("Woof");
    }
    
    @Override
    public void eat(){
        Out.println("Eating from a Dose.");
    }
}
