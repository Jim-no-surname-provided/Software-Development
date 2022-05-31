public class OneDimensionalArray {
    public static void main(String[] args) {

        int[] array = new int[100];

        Out.println("Please enter a list of integer numbers, followed by an 'x':");
        int index = 0;

        do {
            array[index] = In.readInt();
            index++;
        } while (In.done());

        if (index <= 1) { // If there are no numbers
            System.exit(1);
        }

        index -= 2; // Now index is the last index where a number is to be found

        Out.println(String.format("Last read entry is one: %s", (array[index] == 1)));

        boolean areEven = true;

        for (int i = 0; i <= index; i += 2) {
            if (array[i] % 2 != 0) {
                areEven = false;
                break; // We know now, at least one is not a number, so there is no necesity to keep going;
            }
        }

        Out.println(String.format("All entries at even indices are even: %s", areEven));

        int nIncreasingNeighbors = 0;

        for (int i = 0; i <= index; i++) {
            if (array[i] < array[i + 1]) {
                nIncreasingNeighbors++;
            }
        }

        Out.println(String.format("Number of increasing neighbors: %d", nIncreasingNeighbors));

    }
}
