import java.util.*;
public class Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        scanner.close();
        
        if (checkBalancedParentheses(text)) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are not balanced.");
        }
    }
    public static boolean checkBalancedParentheses(String text) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
