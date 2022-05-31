public class StatisticsApplication {

    public static void main(String[] args) {

        Statistics[] statistics = {
                collectStatistics("Hi", "this", "is", "a", "test"),
                collectStatistics("How", "are", "you?"),
                collectStatistics(),
                collectStatistics("This is a very long text", "And", "this", "are", "shorter", "ones"),
                collectStatistics("Na", "na", "na", "na", "na", "na", "batman"),
        };

        for (Statistics st : statistics) {
            
            Out.println(st.smallestString);
            Out.println(st.amountStrings);
            Out.println(st.lengthMean);
            if (st.firstLetters != null)
                Out.println(st.firstLetters);
            else
                Out.println("null");

            Out.println("----------");
        }

    }

    static Statistics collectStatistics(String... strings) {
        Statistics statistics = new Statistics();

        if (strings.length != 0) {
            statistics.firstLetters = new char[strings.length];
            statistics.smallestString = strings[0];
        }

        int sumLengths = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < statistics.smallestString.length()) {
                statistics.smallestString = strings[i];
            }

            sumLengths += strings[i].length();
            statistics.firstLetters[i] = strings[i].charAt(0);
        }

        statistics.amountStrings = strings.length;

        if(statistics.amountStrings > 0) 
            statistics.lengthMean = 1.0 * sumLengths / statistics.amountStrings;

        return statistics;
    }
}