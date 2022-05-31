
class MyFirstProgram {

    public static void main(String[] args) {
        Out.println("Hello user, how old are you (in years)?");
        int age = In.readInt();

        Out.println(String.format("So you're %d years old?", age));

        int days = (int)(age * 365.25);
        Out.println("Wow! That's around " + days + " days!");

        int hours = days * 24;
        Out.println("Or, in terms of hours, over " + hours + " hours!");

    }
}