class InOutExamples {

  public static void main(String[] args) {
    // Einlesen ganzer Zahlen
    Out.print("Bitte zwei ganze Zahlen eingeben: ");
    int i1 = In.readInt();
    int i2 = In.readInt();
    Out.println();

    // 1.a. Ausgeben mit MEHREREN print-Aufrufen
    Out.print("i1 = ");
    Out.println(i1);
    Out.print("i2 = ");
    Out.println(i2);
    Out.println();
    // 1.b. Ausgeben mit EINEM print-Aufruf durch Verketten von Strings
    Out.println("i1 = " + i1);
    Out.println("i2 = " + i2);
    Out.println();
    // 1.c. Ausrichten mit String.format, 3-stellig rechtsbündig
    Out.print(String.format("i1 = %3d%n", i1));
    Out.print(String.format("i2 = %3d%n", i2));
    Out.println();

    // 2. Mehrere Werte in einer Zeile ausgeben
    Out.print(String.format("i1 = %d, i2 = %d%n", i1, i2));
    Out.println();

    // 3.a. PI ohne Nachkommastellen ausgeben
    Out.print(String.format("%.0f%n", Math.PI));
    // 3.b. PI auf 4 Nachkommastellen gerundet ausgeben
    Out.print(String.format("%.4f%n", Math.PI));
    // 3.c. PI auf 8 Nachkommastellen gerundet, mit 4 führenden Nullen ausgeben
    // (8 Nachkommastellen + Komma + 4 führende Nullen -> Breite 13)
    Out.print(String.format("%013.8f%n", Math.PI));

    // 4. Zeichenketten/Wörter einlesen
    Out.println("Bitte Vorname und Nachname eingeben!");
    Out.print("Vorname: ");
    String firstName = In.readWord();
    Out.print("Nachname: ");
    String lastName = In.readWord();
    Out.println();

    // 5.a. Zeichenketten verketten
    Out.println("Name: " + firstName + " " + lastName);
    Out.println();
    // 5.b. Zeichenketten mit String.format ausgeben
    Out.print(String.format("Name: %s %s%n", firstName, lastName));
    Out.println();

    // 6. Zeichenketten rechtsbündig ausgeben
    Out.print(String.format("Vorname:  %20s%n", firstName));
    Out.print(String.format("Nachname: %20s%n", lastName));
    Out.println();

    // 7. Zeichenketten linksbündig ausgeben
    Out.print(String.format("Vorname:  %-20s%n", firstName));
    Out.print(String.format("Nachname: %-20s%n", lastName));
    Out.println();

    // 8. Ganze Zeile einlesen
    Out.println("Bitte E-Mail eingeben!");
    In.readLine(); // notwendig, weil im Eingabepuffer noch ein NewLine ist, das vom letzten
                   // readWord() Aufruf nicht konsumiert wird
    String email = In.readLine(); // Eingabe: max.mustermann@jku.at

    Out.print(String.format("E-Mail: %s%n", email));
    Out.println();

    // 9. Zeichenkette (zwischen zwei Hochkommas) einlesen
    Out.println("Bitte Telefonnummer (in Hochkomma) eingeben!");
    String phone = In.readString(); // Eingabe z.B. "+43(0)732 2468 7132"

    Out.print(String.format("Telefon: %s%n", phone));
    Out.println();
  }
}
