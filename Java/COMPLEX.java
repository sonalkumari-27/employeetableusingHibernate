import java.util.Scanner;

public class COMPLEX {
    private double real;
    private double imaginary;

    public COMPLEX() {
        this.real = 0;
        this.imaginary = 0;
    }

    public COMPLEX(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void acceptValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real part: ");
        this.real = scanner.nextDouble();
        System.out.println("Enter imaginary part: ");
        this.imaginary = scanner.nextDouble();
        scanner.close();
    }

    public void displayValue() {
        if (imaginary == 0) {
            System.out.println(real);
        } else if (real == 0) {
            System.out.println(imaginary + "i");
        } else {
            System.out.println(real + (imaginary >= 0 ? "+" : "") + imaginary + "i");
        }
    }

    public void add(COMPLEX num) {
        this.real += num.real;
        this.imaginary += num.imaginary;
    }

    public void subtract(COMPLEX num) {
        this.real -= num.real;
        this.imaginary -= num.imaginary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first complex number
        System.out.println("Enter the first complex number:");
        COMPLEX c1 = new COMPLEX();
        c1.acceptValue();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter the complex number to add:");
                    COMPLEX addend = new COMPLEX();
                    addend.acceptValue();
                    c1.add(addend);
                    break;
                case 2:
                    System.out.println("\nEnter the complex number to subtract:");
                    COMPLEX subtrahend = new COMPLEX();
                    subtrahend.acceptValue();
                    c1.subtract(subtrahend);
                    break;
                case 3:
                    System.out.println("Result: ");
                    c1.displayValue();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
