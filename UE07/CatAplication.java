public class CatAplication {
    public static void main(String[] args){
        Cat garfield = new Cat("Garfield");
        garfield.play();
        garfield.play();
        garfield.eat();
        garfield.play();
        
        
        Cat mitzy = new Cat("Mitzy");
        mitzy.play();
        mitzy.play();


        BigCat simba = new BigCat("Simba", 50);
        simba.play();
        simba.eat();
        simba.play();

        CatShelter shelter = new CatShelter();
        shelter.add(garfield);
        shelter.add(mitzy);
        shelter.add(simba);

        shelter.print();
        shelter.feedAll();


    }

}