public class StudentListApplication {
    public static void main(String[] args) {
        Student students[] = new Student[] {
                new Student("Gabe", 180),
                new Student("Harold", 42),
                new Student("Maxine", 72),
                new Student("Bob", 3),
                new Student("Lilly", 144),
                new Student("Susi", 144) };

        StudentList list = StudentList.from(students);
        list.add(new Student("Helmut c:", 15000));

        Out.print("List size: ");
        Out.println(list.size);

        Out.println("List content: ");
        Out.println(list);

        Out.print("Most ECTS: ");
        Out.println(list.studentWithMostECTS());

        Out.print("Fewest ECTS: ");
        Out.println(list.studentWithFewestECTS());

        Out.print("Student at index 2: ");
        Out.println(list.getAtIndex(2));

        Out.print("Student at index 5: ");
        Out.println(list.getAtIndex(5));

        Out.print("Student at index 1337: ");
        Out.println(list.getAtIndex(1337));

        Out.println("Filter ECTS >= 50 (new list):");
        StudentList filteredList = list.studentsWithECTSAbove(50);

        Out.print("Filtered list - Size: ");
        Out.println(filteredList.size);

        Out.print("Filtered list - Content: ");
        Out.println(filteredList);

        Out.print("Filtered list - Most ECTS: ");
        Out.println(filteredList.studentWithMostECTS());

        Out.print("Filtered list - Fewest ECTS: ");
        Out.println(filteredList.studentWithFewestECTS());

        Out.print("Filtered list - Student at index 2: ");
        Out.println(filteredList.getAtIndex(2));

        Out.print("Filtered list - Student at index 5: ");
        Out.println(filteredList.getAtIndex(5));

        Out.print("Filtered list - Student at index 1337: ");
        Out.println(filteredList.getAtIndex(1337));

        Out.print("Size and content after clearing filtered list: ");
        filteredList.clear();
        Out.print(filteredList.size);
        Out.print(", ");
        Out.println(filteredList);

        Out.println("Remove ECTS > 100 (modify list)");
        list.removeStudentsWithMoreECTSThan(100);

        Out.print("List size: ");
        Out.println(list.size);

        Out.print("List content: ");
        Out.println(list);

        Out.print("Most ECTS: ");
        Out.println(list.studentWithMostECTS());

        Out.print("Fewest ECTS: ");
        Out.println(list.studentWithFewestECTS());

        Out.print("Student at index 2: ");
        Out.println(list.getAtIndex(2));

        Out.print("Student at index 5: ");
        Out.println(list.getAtIndex(5));

        Out.print("Student at index 1337: ");
        Out.println(list.getAtIndex(1337));

        Out.println("Remove ECTS > 0 (modify list)");
        list.removeStudentsWithMoreECTSThan(0);

        Out.print("List size: ");
        Out.println(list.size);

        Out.print("List content: ");
        Out.println(list);

        Out.print("Most ECTS: ");
        Out.println(list.studentWithMostECTS());

        Out.print("Fewest ECTS: ");
        Out.println(list.studentWithFewestECTS());

        Out.print("Student at index 2: ");
        Out.println(list.getAtIndex(2));

        Out.print("Student at index 5: ");
        Out.println(list.getAtIndex(5));

        Out.print("Student at index 1337: ");
        Out.println(list.getAtIndex(1337));

    }

}
