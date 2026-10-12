import studentmanagement.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(
            101,
            "Khushi",
            "Computer Science"
        );

        System.out.println("Student Information");
        System.out.println("-------------------");
        student.displayInfo();
    }
}