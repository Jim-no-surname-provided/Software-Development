public class SimpleQuestionsGame {
    public static void main(String[] args) {
        double num1 = Math.random();
        double num2 = Math.random();
        double num3 = Math.random();
        double num4 = Math.random();

        double smaller = Math.min(Math.min(num1, num2),
        Math.min(num3, num4));

        num1 = smaller / num1;
        num2 = smaller / num2;
        num3 = smaller / num3;
        num4 = smaller / num4;
        // One is 1, the others not

        num1--;
        num2--;
        num3--;
        num4--;
        // One is 0, the others not
        
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        num3 = Math.abs(num3);
        num4 = Math.abs(num4);
        // One is 0, the others are greater
        
        num1 = Math.ceil(num1);
        num2 = Math.ceil(num2);
        num3 = Math.ceil(num3);
        num4 = Math.ceil(num4);
        // One is 0, the others are at least 1
        
        num1 = Math.min(num1, 1);
        num2 = Math.min(num2, 1);
        num3 = Math.min(num3, 1);
        num4 = Math.min(num4, 1);
        // One is 0, the others are 1

        num1--;
        num2--;
        num3--;
        num4--;
        // One is -1, the others are 0

        num1 = -num1;
        num2 = -num2;
        num3 = -num3;
        num4 = -num4;
        // One is 1, the others are 0
        

        String simbol1 = String.format("%." + (int) num1 + "s", "+");
        String simbol2 = String.format("%." + (int) num2 + "s", "-");
        String simbol3 = String.format("%." + (int) num3 + "s", "*");
        String simbol4 = String.format("%." + (int) num4 + "s", "/");
        String finalSimbol = simbol1 + simbol2 + simbol3 + simbol4;
        // The finalSimbol is one of the three

        int numToOperate1 = (int) (Math.random() * 19 + 1); // Random between 1 and 20
        int numToOperate2 = (int) (Math.random() * 19 + 1);

        String operation = String.format("%d %s %d", numToOperate1, finalSimbol, numToOperate2);

        int resultCase1 = (numToOperate1 + numToOperate2) * (int) num1; // Every one will be multiplied by zero except for the one
        int resultCase2 = (numToOperate1 - numToOperate2) * (int) num2;
        int resultCase3 = (numToOperate1 * numToOperate2) * (int) num3;
        int resultCase4 = (numToOperate1 / numToOperate2) * (int) num4;
        
        int result = (int) (resultCase1 + resultCase2 + resultCase3 + resultCase4);
        
        String note = String.format("%." + (int) num4 * 100 + "s", "(Respond without the decimals)"); // For if it is a division
        
        Out.println("================================================");
        Out.println("Hi! Welcome to my first game in java.");
        Out.println("It was made on purpose with a very few bricks.");
        Out.println("I hope you like it.");
        Out.println("================================================");
        Out.println("What is the result of the following operation?");
        Out.println("");
        Out.println(String.format("%24s", operation)); // To centrate it
        Out.println("");
        Out.println(note);
        int answered = In.readInt();

        double isAnswerWrong = (float) answered - result + 1;
        // 1 if correct, other if not

        isAnswerWrong--;
        isAnswerWrong = Math.abs(isAnswerWrong);
        isAnswerWrong = Math.ceil(isAnswerWrong);
        isAnswerWrong = Math.min(isAnswerWrong, 1);
        // 0 if correct, 1 if not

        int isAnswerCorrect = (int) isAnswerWrong - 1;
        isAnswerCorrect = -isAnswerCorrect;
        // 1 if correct, 0 if not

        String messageCorrect = String.format("%." + (int) isAnswerCorrect * 100 + "s", "Great! You won!");
        String messageWrong = String.format("%." + (int) isAnswerWrong * 100 + "s", "Sorry. The real answer is: " + result);

        Out.println(messageCorrect + messageWrong);
        Out.println("Thanks for playing!");
        Out.println("");

    }
}
