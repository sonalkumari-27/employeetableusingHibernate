import java.util.Random;
public class MatrixOperations {
    public static void main(String[] args) {
        int size = 3;
        int[][] matrix = new int[size][size];
        Random random = new Random();
        System.out.println("Original Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int mainDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            mainDiagonalSum += matrix[i][i];
        }
        System.out.println("Sum of main diagonal elements: " + mainDiagonalSum);
        int secondaryDiagonalProduct = 1;
        for (int i = 0; i < size; i++) {
            secondaryDiagonalProduct *= matrix[i][size - 1 - i];
        }
        System.out.println("Product of secondary diagonal elements: " + secondaryDiagonalProduct);
    }
}
