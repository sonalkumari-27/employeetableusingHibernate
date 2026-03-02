import java.util.Scanner;
public class Multiplechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();
        if (secondNumber != 0 && firstNumber % secondNumber == 0) {
            System.out.println(firstNumber + " is a multiple of " + secondNumber);
        } else {
            System.out.println(firstNumber + " is not a multiple of " + secondNumber);
        }
        scanner.close();
    }
}

