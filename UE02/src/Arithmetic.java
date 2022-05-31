public class Arithmetic {
  public static void main(String[] args) {
    int i = 4 / 3; // i -> 1
    Out.println("i = " + i);

    double d = 4 / 3; // d -> 1.0
    Out.println("d = " + d);

    d = 4.0 / 3; // d -> 1.33333
    Out.println("d = " + d);

    d = (double) 4 / 3; // d --> 1.33333
    Out.println("d = " + d);

    d = (double) (4 / 3); // d --> 1.0
    Out.println("d = " + d);

    i = (int) 4.0 / 3; // c -> 1
    Out.println("i = " + i);

    i = 127; // i -> 127
    Out.println("i = " + i);

    byte x = (byte) i; // x -> 127
    Out.println("x = " + x);

    i = 128; // i -> 128
    Out.println("i = " + i);

    x = (byte) i; // x -> -128
    Out.println("x = " + x);

    Out.print("a = ");
    double a = In.readDouble();
    Out.print("b = ");
    double b = In.readDouble();
    double c = Math.sqrt(a * a + b * b);
    Out.println(String.format("c = %10.2f", c));

    Out.print("radius = ");
    double r = In.readDouble();
    double area = Math.pow(r, 2) * Math.PI;
    // alternativ
    // double area = r * r * Math.PI;
    Out.println(String.format("A = %10.2f", area));
  }
}
