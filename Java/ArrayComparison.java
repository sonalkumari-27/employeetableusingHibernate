import java.util.Arrays;
import java.util.Random;
public class ArrayComparison {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(500) + 1;
            array2[i] = random.nextInt(500) + 1;
        }
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        int commonCount = 0;
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    commonCount++;
                    break;
                }
            }
        }
        System.out.println("Number of common elements: " + commonCount);
        int sumOfCommon = 0;
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    sumOfCommon += num1;
                    break;
                }
            }
        }
        System.out.println("Sum of common elements: " + sumOfCommon);
        int nonCommonCount = 0;
        int sumOfNonCommon = 0;
        for (int num1 : array1) {
            boolean found = false;
            for (int num2 : array2) {
                if (num1 == num2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                nonCommonCount++;
                sumOfNonCommon += num1;
            }
        }
        for (int num2 : array2) {
            boolean found = false;
            for (int num1 : array1) {
                if (num2 == num1) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                nonCommonCount++;
                sumOfNonCommon += num2;
            }
        }
        double averageOfNonCommon = (double) sumOfNonCommon / nonCommonCount;
        System.out.println("Average of non-common elements: " + averageOfNonCommon);
    }
}
