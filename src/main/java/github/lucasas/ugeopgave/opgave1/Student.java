package github.lucasas.ugeopgave.opgave1;

public class Student {
    private final String name;
    private final int age;
    private final String studentId;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public void printInfo() {
        System.out.println("=== Info ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + studentId);
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }
}
