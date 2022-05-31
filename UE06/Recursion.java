public class Recursion {
    public static void main(String[] args) {

        Out.println("SumTo: ");

        Out.println(sumTo(100));
        Out.println(sumTo(10));
        Out.println(sumTo(45));

        Out.println("Modulo: ");
        for (int i = 0; i <= 6; i++) {
            Out.println(modulo(i, 3));
        }

    }

    static long modulo(int a, int b) {
        if (a < b) {
            return a;
        }
        return modulo(a - b, b);
    }

    static long moduloNotRecursive(int a, int b) {
        return a - (a / b) * b;
    }

    static long sumToNotRecursive(int n) {
        if (n < 0) {
            return 0;
        }

        return n * (n + 1) / 2;
    }

    static long sumTo(int n) {
        if (n < 0) {
            return 0;
        }

        return n + sumTo(n - 1);
    }
}