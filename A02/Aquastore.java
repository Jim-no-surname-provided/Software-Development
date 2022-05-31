public class Aquastore {
    public static void main(String[] args) {
        String LINES = "==================================================";

        Out.println(LINES);
        Out.println("Aquastore - Order");
        Out.println(LINES);
        
        Out.print("Auqarium size (in liter): ");
        float size = In.readFloat();
        
        float food = 0.005f * size;
        float foodTotal = food * 10;        
        
        float fertilizer = 1.8f * size;
        float fertilizerTotal = fertilizer * 0.04f;
        
        float filterWool = 0.002f * size;
        float filterWoolTotal = filterWool * 30;
        
        float total = filterWool + fertilizerTotal + filterWoolTotal;
        
        Out.println(LINES);
        Out.println(String.format("Food         %10.2f kg x 10,00 =%10.2f EUR", food, foodTotal));
        Out.println(String.format("Fertilizer   %10.2f ml x  0,04 =%10.2f EUR", fertilizer, fertilizerTotal));
        Out.println(String.format("Filter Wool  %10.2f kg x 30,00 =%10.2f EUR", filterWool, filterWoolTotal));
        Out.println("--------------------------------------------------");
        Out.println(String.format("TOTAL %40.2f EUR", total));
        Out.println(LINES);

    }
}
