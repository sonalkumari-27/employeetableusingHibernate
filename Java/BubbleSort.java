public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 1};
        System.out.println("Original Array:");
        printArray(array);
        bubbleSort(array);
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("\nAfter Pass " + (i + 1) + ", Comparison " + (j + 1) + ":");
                    printArray(arr);
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
