import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        System.out.print("Enter your height in inches: ");
        double heightInInches = scanner.nextDouble();
        double bmi = calculateBMI(weightInPounds, heightInInches);
        System.out.println("Your BMI is: " + bmi);
        scanner.close();
    }
    private static double calculateBMI(double weightInPounds, double heightInInches) {
        return (weightInPounds / (heightInInches * heightInInches)) * 703;
    }
}
