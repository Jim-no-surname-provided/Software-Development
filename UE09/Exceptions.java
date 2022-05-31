
public class Exceptions {
    public static void main(String[] args) {

        /*
         * int x = 1 / 0;
         * 
         * int[] arr = {};
         * int test = arr[7];
         * 
         * String s = null;
         * int l = s.length();
         * 
         * recursive();
         */

        int x = 23;
        String s = null;

        if (Math.random() > 0.5) {
            s = "algo";
        }

        try {

            x = 23 / s.length();

            /*
             * Este es el único lugar donde se puede hacer esto.
             * El tipo de ex es el padre de ambos. En este caso es RuntimeException.
             */

        } catch (ArithmeticException | NullPointerException ex) {
            Out.println("WATCH OUT. Error: " + ex.getMessage());
            Out.println("And now to String: " + ex.toString());
            Out.println();
            Out.println("And this is the StackTrance: ");
            ex.printStackTrace();
        } finally {
            Out.println(x);
        }
    }

    /**
     * This causes a stackOverflow, so pls don't use it.
     */
    public static void recursive() {
        recursive();
    }
}