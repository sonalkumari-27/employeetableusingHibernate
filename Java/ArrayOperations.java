import java.util.Random;
import java.util.Scanner;
public class ArrayOperations {  
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) { 
            array[i] = random.nextInt(100) + 1;
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of all elements in the array: " + sum);
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
        double average = (double) sum / array.length;
        System.out.println("Average of the array elements: " + average);
        System.out.print("Enter a value to search in the array: ");
        int searchValue = scanner.nextInt();
        boolean found = false;
        for (int num : array) {
            if (num == searchValue) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The value " + searchValue + " is present in the array.");
        } else {
            System.out.println("The value " + searchValue + " is not present in the array.");
        }
            scanner.close();
    }
}
