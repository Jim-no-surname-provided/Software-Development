public class Calculations {
    public static void main(String[] args) {

        Out.println("Pls, write the 4 whole numbers ");

        Out.print("Number1: ");
        int num1 = In.readInt();

        Out.print("Number2: ");
        int num2 = In.readInt();

        Out.print("Number3: ");
        int num3 = In.readInt();

        Out.print("Number4: ");
        int num4 = In.readInt();

        int sum = num1 + num2 + num3 + num4;
        Out.println(String.format("Sum: %d", sum));

        int product = num1 * num2 * num3 * num4;
        Out.println(String.format("Product: %d", product));

        int weirdSum = (num1 + num2) * (num3 + num4);
        Out.println(String.format("Sum of first two times sum of last two: %d", weirdSum));

        float division = num1 / num4;
        Out.println(String.format("Quotient of first and last: %.2f", division));

        int rest = num1 % num3;
        Out.println(String.format("Rest of first and third: %d", rest));

        float sqrt = (float) Math.sqrt(num4);
        Out.println(String.format("Square-root of last: %.2f", sqrt));

        int power = (int) Math.pow(num2, num4);
        Out.println(String.format("Second to the power of the fourth: %d", power));

        double lastResult = (num1 / 4.0) * (Math.pow(num2, Math.PI * num3) / (num4 - 1));
        Out.println(String.format(
                "The multiplication between the quarter of the first number and the division where the dividend is the second number raised to the product between pi and c, and the divisor is the difference between d and 1 is: %.2f",
                lastResult));

        Out.println("\n");
    }
}
