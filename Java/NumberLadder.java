public class NumberLadder {
    public static void main(String[] args) {
        int numberOfSteps = 5;
        for (int i = 1; i <= numberOfSteps; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
