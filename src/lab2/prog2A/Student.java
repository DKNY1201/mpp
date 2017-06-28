package lab2.prog2A;

/**
 * Created by Bi on 6/27/17.
 */
public class Student {
    String name;
    String studentID;
    GradeReport grade;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        grade = new GradeReport(this);
    }

    public static void main(String[] args) {
    }
}
