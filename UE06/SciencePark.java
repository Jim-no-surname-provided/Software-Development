public class SciencePark {
    int number;
    String name;
    String color;

    static String universityName = "JKU";

    SciencePark(){}
    SciencePark(int number, String color){this(number, "Science Park " + number, color);}
    SciencePark(int number, String name, String color){
        this.number = number;
        this.name = name;
        this.color = color;
    }

    public String toString() {
        return String.format("SciencePark with number %s, color %s and name %s at the %s", number, color, name, universityName);
    }
}
