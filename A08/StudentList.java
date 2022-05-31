public class StudentList {
    StudentListNode head;
    int size = 0;

    public int getSize() {
        return size;
    }

    public void add(Student student) {
        size++;

        int ects = student.getECTS();

        if (head == null || head.student.getECTS() <= ects) {
            head = new StudentListNode(student, head);
            return;
        }

        // head.ects > student.ects
        StudentListNode current = head;

        while (current.next != null && current.next.student.getECTS() > ects) {
            current = current.next;
        } // current.next == null || current.next.ects <= ects

        current.next = new StudentListNode(student, current.next);
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public StudentList studentsWithECTSAbove(int minECTS) {
        StudentList newList = new StudentList();

        StudentListNode current = head;
        while (current != null && current.student.getECTS() >= minECTS) {
            newList.add(current.student);
            current = current.next;
        }

        return newList;
    }

    public void removeStudentsWithMoreECTSThan(int maxECTS) {
        StudentListNode current = head;
        while (current != null && current.student.getECTS() > maxECTS) {
            current = current.next;
            size--;
        }

        head = current;
    }

    public Student getAtIndex(int index) {
        if (index < 0 || index >= size)
            return null;

        int i = 0;
        StudentListNode current = head;
        while (i < index) {
            current = current.next;
            i++;
        }

        return current.student;
    }

    public Student studentWithMostECTS() {
        if (head == null)
            return null;
        return head.student;
    }

    public Student studentWithFewestECTS() {
        if (head == null)
            return null;

        StudentListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.student;
    }

    @Override
    public String toString() {
        if (head == null)
            return "[]";
        StringBuilder sb = new StringBuilder("[");

        StudentListNode current = head;

        while (current != null) {
            sb.append(current.student);
            sb.append(", ");
            current = current.next;
        }

        sb.replace(sb.length() - 2, sb.length(), "]");

        return sb.toString();
    }

    public static StudentList from(Student... students) {
        StudentList list = new StudentList();
        for (Student student : students) {
            list.add(student);
        }
        return list;
    }

}