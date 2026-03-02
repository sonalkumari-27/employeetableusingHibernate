import java.util.Scanner;
public class largerNumbercomparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is larger.");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is larger.");
        } else {
            System.out.println("These numbers are equal.");
        }
        scanner.close();
    }
}

