public class Power {
    public static void main(String[] args) {
        
        test(2, 6);
        test(3, 3);
        test(5, 3);
        test(10,5);

    }

    static void test(int a, int b){
        Out.println("pow:");
        Out.println(String.format("a = %d, b = %d", a, b));
        Out.println(String.format("Result: %d", pow(a, b)));
    }

    static int pow(int a, int b){
        if(b == 1){
            return a;
        }
        return a * pow(a, b - 1);
    }
}
