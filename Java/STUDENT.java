import java.util.Scanner;
public class STUDENT {
    private int roll;
    private String name;
    private String course;
    private String admissionDate;
    private int[] marks;
    public STUDENT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        this.roll = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter course: ");
        this.course = scanner.nextLine();
        System.out.print("Enter admission date: ");
        this.admissionDate = scanner.nextLine();
        this.marks = new int[5];
    }
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }
    public void receiveMarks(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }
    public void prepareMarkSheet() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Admission Date: " + admissionDate);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
    public static void displayNumberOfStudents(STUDENT[] students) {
        System.out.println("Number of students who have taken admission: " + students.length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        STUDENT[] students = new STUDENT[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i] = new STUDENT();
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nDetails for student " + (i + 1) + ":");
            students[i].prepareMarkSheet();
        }
        displayNumberOfStudents(students);
             scanner.close();
    }
}
