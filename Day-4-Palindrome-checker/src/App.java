import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("##PALINDROME CHECKER##");

        UserInput input = new UserInput(scanner);
        String wordToCheck = input.getUserInput();

        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.isPalindrome(wordToCheck);

        if (isPalindrome) {
            System.out.println(wordToCheck + " is a palindrome.");
        } else {
            System.out.println(wordToCheck + " is not a palindrome.");
        }

        scanner.close();
    }
}

class UserInput {

    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getUserInput() {
        System.out.println("Enter a word, phrase or sentence to check: ");
        String input = scanner.nextLine();

        String wordToCheck = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (wordToCheck.isEmpty()) {
            System.out.println("Invalid input. Please enter a valid word, phrase, or sentence.");
            return getUserInput();
        }

        return wordToCheck;
    }
}

class PalindromeChecker {
    public boolean isPalindrome(String wordToCheck) {
        StringBuilder builder = new StringBuilder(wordToCheck);

        return builder.reverse().toString().equals(wordToCheck);
    }

}