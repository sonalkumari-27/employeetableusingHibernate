class Student2 {
    private String name;
    private int rollNumber;
    public void getData(String studentName, int studentRollNumber) {
        name = studentName;
        rollNumber = studentRollNumber;
    }
    public void printData() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}
public class STtest {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.getData("SONAL KUMARI",46 );
        s2.getData("PRAJAKTA SAHA", 53);
        System.out.println("Details for Student 1:");
        s1.printData();
        System.out.println("\nDetails for Student 2:");
        s2.printData();
    }
}
