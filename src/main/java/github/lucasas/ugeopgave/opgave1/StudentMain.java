package github.lucasas.ugeopgave.opgave1;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {
    void main() {
        Student student1 = new Student("Lucas", 20, "12r13241");
        Student student2 = new Student("Carl", 50, "qfrqfsd21");
        Student student3 = new Student("Valdemar", 23, "1224dad23r5hg");
        Student[] students = {student1, student2, student3};

        Arrays.stream(students).forEach(Student::printInfo);
        findOldestStudent(students);
        findStudentById(students,"qfrqfsd21");
    }


    public void findOldestStudent(Student[] students) {
        Arrays.stream(students)
                .max(Comparator.comparingInt(Student::getAge))
                .orElseThrow()
                .printInfo();

    }

    public void findStudentById(Student[] students, String id) {
        Arrays.stream(students)
                .filter(student -> student.getStudentId().equals(id))
                .findFirst()
                .orElseThrow()
                .printInfo();
    }
}
