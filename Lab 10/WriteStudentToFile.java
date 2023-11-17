import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class WriteStudentToFile {

    public static class Student {
        int rollno;
        String name;
        String department;

        public Student(int rollno, String name, String department) {
            this.rollno = rollno;
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return "Roll No: " + rollno + ", Name: " + name + ", Department: " + department;
        }
    }

    public static void main(String[] args) {
        Student student = new Student(1, "John Doe", "Computer Science");
        try (PrintStream out = new PrintStream(new FileOutputStream("student.txt"))) {
            out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}