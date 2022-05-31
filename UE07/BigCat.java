public class BigCat extends Cat {
    public int speed;
    
    public BigCat(String name, int speed){
        // Para heredar de BigCat se necesita que se llame al constructor de Cat. Si no, el compilador intentará super(); 
        super(name);
        this.speed = speed;
    }
    public BigCat(String name){
        this(name, 0);
    }


    public void hunt(){
        Out.println(name + " is hunting.");
    }

    @Override
    public void eat() {
        hunt();
        super.eat();
    }


    public void llamarSuperSuperSuper(){
        //super.super.hashCode() is not posible
        Out.println(this.getClass().getSuperclass().getSuperclass().getName()); //is posible
    }


}
