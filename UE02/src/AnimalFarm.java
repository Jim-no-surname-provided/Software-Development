public class AnimalFarm {
  public static void main(String[] args) {
    Out.print("Animal kind: ");
    String kind = In.readWord();
    Out.print("Name: ");
    String name = In.readWord();
    Out.print("Age (years): ");
    int age = In.readInt();
    Out.print("Weight (kg): ");
    double weight = In.readDouble();
    In.readLine();
    Out.print("Favorite food: ");
    String food = In.readWord();

    Out.println();
    Out.println("--------------- Animal farm ---------------");
    Out.println("The " + kind + " " + name + " is " + age + " year(s) old");
    Out.println("It weighs " + weight + " kilogramms");
    Out.println("Its favorite food is " + food);

    Out.println();
    Out.println("--------------- Animal farm ---------------");
    Out.println(String.format("The %s %s is %d year(s) old", kind, name, age));
    Out.println(String.format("It weighs %,.2f kilogramms", weight));
    Out.println("Its favorite food is:");
    Out.println(String.format("%-10s", food));
  }
}
