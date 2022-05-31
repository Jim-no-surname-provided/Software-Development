public class StudentListNode {
    public Student student;
    public StudentListNode next;

    public StudentListNode(Student student, StudentListNode next) {
        this.student = student;
        this.next = next;
    }
    public StudentListNode(Student student){
        this(student, null);
    }


}
