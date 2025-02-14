import java.util.List;
import java.util.ArrayList;

class Course {
    String name;
    int capacity;
    int enrolled;
    String prerequisite;

    public Course(String name, int capacity, String prerequisite) {
        this.name = name;
        this.capacity = capacity;
        this.enrolled = 0;
        this.prerequisite = prerequisite;
    }

    public void enroll(Student student) {
        if (enrolled >= capacity) {
            System.out.println("Error: The course '" + name + "' is full.");
            return;
        }
        if (prerequisite != null && !student.hasCompleted(prerequisite)) {
            System.out.println("Error: Complete '" + prerequisite + "' before enrolling in '" + name + "'.");
            return;
        }
        enrolled++;
        System.out.println(student.name + " enrolled in " + name + ".");
    }
}

class Student {
    String name;
    List<String> completedCourses;

    public Student(String name) {
        this.name = name;
        this.completedCourses = new ArrayList<>();
    }

    public boolean hasCompleted(String courseName) {
        return completedCourses.contains(courseName);
    }

    public void complete(String courseName) {
        completedCourses.add(courseName);
        System.out.println(name + " completed " + courseName + ".");
    }
}

public class UniversityEnrollment {
    public static void main(String[] args) {
        System.out.println("Code By Aaroh Gaur(22BCS17238)");
        Course coreJava = new Course("Core Java", 2, null);
        Course advancedJava = new Course("Advanced Java", 2, "Core Java");

        Student student1 = new Student("Aaroh");
        Student student2 = new Student("Jagdeep");

        advancedJava.enroll(student1);
        student1.complete("Core Java");
        advancedJava.enroll(student1);
        advancedJava.enroll(student2);
    }
}
