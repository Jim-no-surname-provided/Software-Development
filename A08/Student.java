public class Student {
    private final String name;
    // Subject
    private final int ects;

    public Student(String name, int ects) {
        this.name = name;
        this.ects = ects;
    }

    public String getName() {
        return name;
    }

    public int getECTS() {
        return ects;
    }

    @Override
    public String toString() {
        return String.format("Student{%s: %d}", name, ects);
    }


    
}
