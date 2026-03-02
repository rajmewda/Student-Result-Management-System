package StudentResultManagement.resultmanager;

import StudentResultManagement.model.Student;
import java.util.ArrayList;

public class ResultManager {

    // Store multiple students
    private ArrayList<Student> studentList = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    // Search student by roll number
    public Student findStudentByRoll(int rollNumber) {
        for (Student student : studentList) {
            if (student.getRollnumber() == rollNumber) {
                return student;
            }
        }
        return null; // if not found
    }

    // Display all students
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student student : studentList) {
            student.displayResult();
            System.out.println("----------------------");
        }
    }
}
