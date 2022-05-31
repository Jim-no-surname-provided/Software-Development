public class ClassesUebung {
    public static void main(String[] args) {
        SciencePark sp1 = new SciencePark(1, "Mechatronik", "Green");
        SciencePark sp2 = new SciencePark(2, "Orange");
        SciencePark sp3 = new SciencePark(3, "Brown");

        Out.println(sp1.toString());
        Out.println(sp2.toString());

        SciencePark.universityName = "Technical University of Linz";

        Out.println(sp3.toString());

    }
}
