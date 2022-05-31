public class Farm {
  private final String owner;
  private final String city;

  private final Stable[] stables = new Stable[10];
  private int nStables = 0;

  private final Animal[] animals = new Animal[100];
  private int nAnimals = 0;

  Farm(String owner, String city) {
    this.owner = owner;
    this.city = city;
  }

  public void switchStable(Animal a, Stable from, Stable to) throws FarmException, StableException {
    if (from == to) {
      throw new FarmException("The new stable and the old one are the same stable");
    }

    from.removeAnimal(a);
    to.addAnimal(a);
  }

  public String toString() {
    return String.format("Farm in %s owned by %s", city, owner);
  }

  public void print() {
    printStables();
    printAnimals();
  }

  private void printStables() {
    Out.println("Stables:");
    for (int i = 0; i < nStables; i++) {
      Out.println("[" + i + "] " + stables[i]);
    }
  }

  private void printAnimals() {
    Out.println("Animals:");
    for (int i = 0; i < nAnimals; i++) {
      Out.println("[" + i + "] " + animals[i]);
    }
  }

  private void addAnimal(Animal a) {
    animals[nAnimals] = a;
    nAnimals++;
  }

  private void addStable(Stable s) {
    stables[nStables] = s;
    nStables++;
  }

  private Animal readAnimalByIndex() {
    Out.print("Select animal (index): ");
    int i = In.readInt();
    In.readLine(); // to remove \n from input stream
    return animals[i];
  }

  private Stable readStableByIndex(String dInfo) {
    Out.print("Select " + (dInfo == null ? "" : dInfo + " ") + "stable (index): ");
    int i = In.readInt();
    In.readLine(); // to remove \n from input stream
    return stables[i];
  }

  private Stable readStableByIndex() {
    return readStableByIndex(null);
  }

  public void run() {
    char op;
    do {
      printMenu();
      Out.print("Select operation: ");
      op = In.readChar();
      try {

        switch (op) {
          case 'p':
            print();
            break;
          case 'a':
            addAnimal(readNewAnimal());
            break;
          case 's':
            addStable(readNewStable());
            break;
          case '+': {
            printAnimals();
            Animal e = readAnimalByIndex();
            printStables();
            Stable s = readStableByIndex();
            s.addAnimal(e);
            break;
          }
          case '-': {
            printAnimals();
            Animal e = readAnimalByIndex();
            printStables();
            Stable s = readStableByIndex();
            s.removeAnimal(e);
            break;
          }
          case 'c': {
            printAnimals();
            Animal a = readAnimalByIndex();
            printStables();
            Stable from = readStableByIndex("from");
            Stable to = readStableByIndex("to");
            switchStable(a, from, to);
          }
          case 'f': {
            printAnimals();
            Animal a = readAnimalByIndex();
            Out.print("Change daily food by: ");
            double delta = In.readDouble();
            In.readLine(); // to remove \n from input stream
            a.changeFoodRation(delta);
            break;
          }
        }
      } catch (IllegalArgumentException e) {
        Out.println("Some argument was wrong.");
        Out.println(e.getMessage());

      } catch (AnimalException e) {
        Out.println("Exception: " + e.getMessage());
        Out.println("Animal: " + e.getAnimal());

      } catch (StableException e) {
        Out.println("Something went wrong with the stable:");
        Out.println(e.getMessage());
        Out.println("Stable: \n" + e.getStable());

      } catch (FarmException e) {
        Out.println("Exception: " + e.getMessage());

      }

      Out.println();
    } while (op != 'x');

  }

  private static void printMenu() {
    Out.println("=============== Menu ===============");
    Out.println("Print farm ................... p");
    Out.println("Add new animal to farm ....... a");
    Out.println("Add new stable to farm ....... s");
    Out.println("Assign animal to stable ...... +");
    Out.println("Remove animal from stable .... -");
    Out.println("Switch animal's stable........ c");
    Out.println("Change animal's daily food ... f");
    Out.println("Exit application ............. x");
  }

  private static Animal readNewAnimal() {
    Out.print("Enter animal name: ");
    String name = In.readWord();
    Out.print("Enter daily food: ");
    double food = In.readDouble();
    In.readLine(); // to remove \n from input stream
    return new Animal(name, food);
  }

  private static Stable readNewStable() {
    Out.print("Enter stable number: ");
    int nr = In.readInt();
    Out.print("Enter stable capacity: ");
    int capacity = In.readInt();
    In.readLine(); // to remove \n from input stream
    return new Stable(nr, capacity);
  }

  public static Farm createExampleFarm() throws StableException {
    Farm f = new Farm("Farmer McTesty", "Testtown");
    // hard-coded default initialization
    Stable stable1 = new Stable(1, 2);
    Stable stable2 = new Stable(2, 5);
    f.addStable(stable1);
    f.addStable(stable2);
    Animal a0 = new Animal("Blinky");
    Animal a1 = new Animal("Susi", 50.0);
    Animal a2 = new Animal("Berta", 52.5);
    Animal a3 = new Animal("Ducky", 2.5);
    f.addAnimal(a0);
    f.addAnimal(a1);
    f.addAnimal(a2);
    f.addAnimal(a3);
    stable1.addAnimal(a0);
    stable1.addAnimal(a1);
    stable2.addAnimal(a2);
    return f;
  }
}
