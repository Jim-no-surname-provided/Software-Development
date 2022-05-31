public class Area {
    public static void main(String[] args) {
        Out.println("Please, enter the values.");
        Out.print("Area width (in meters): ");
        float width = In.readFloat();

        Out.print("Area height (in meters): ");
        float height = In.readFloat();

        float area = width * height;
        Out.println(String.format("Area: %.2f square meters", area));

        float permiter = 2 * (width + height);
        Out.println(String.format("Permiter: %.2f meters", permiter));

        float diagonal = (float)Math.sqrt(width * width + height * height);
        Out.println(String.format("Diagonal: %.2f meters", diagonal));

        float seeds = area * .025f;
        Out.println(String.format("Seeds: %.2f kg", seeds));
        
        float FENCE_METER_PRICE = 30.5f;

        float fencePrice = FENCE_METER_PRICE * permiter * 3f / 4;
        Out.println(String.format("Fence price: %.2f Euro", fencePrice));

        float shortSide = Math.min(width, height);
        Out.println(String.format("Short side: %.2f meters", shortSide));

        
        double volume = (Math.PI
         * Math.pow(shortSide / 4, 3))
         * (4f / 3)
        / 2;
        Out.println(String.format("Igloo: %.2f cubic meters", volume));
    }
}