import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        int wordCount = countWords(inputText);
        System.out.println("Number of words in the given text: " + wordCount);
        scanner.close();
    }
    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
