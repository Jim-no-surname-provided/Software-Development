class MyCorrectProgram {
  public static void main(String[] args) { // mian -> main, '{' fehlt
    String name = In.readLine(); // '()' fehlen + Name großgeschrieben
    Out.println("Hello " + name + "! Nice to meet you!"); // Ot -> Out, Variable "Name" sollte ausgegeben werden
    Out.println("What's the weather today?"); // printn -> println
    String weather = In.readLine();   // string kleingeschrieben, wheather -> weather
    Out.println("And what's the temperature?"); // ')' fehlt
    double deg = In.readDouble();  // ';' fehlt, reedDouble -> readDouble
    Out.println(String.format("Oh, so its %s with %.1f degrees?", weather, deg)); // %d -> %0.1f, "? -> ?"
  }
}
