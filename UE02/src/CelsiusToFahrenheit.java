public class CelsiusToFahrenheit {
  public static void main(String[] args) {
    Out.print("Celsius: ");
    double c = In.readDouble();
    double f = c * (9.0/5.0) + 32;
    Out.println(String.format("Fahrenheit: %.3f%n", f));
  }
}
