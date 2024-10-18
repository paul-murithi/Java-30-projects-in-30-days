import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        GenerateRandomNumber generateRandomNumber = new GenerateRandomNumber();
        UserInput userInput = new UserInput(new Scanner(System.in));
        UserInputValidation userInputValidation = new UserInputValidation(userInput);

        int randomNumber = generateRandomNumber.generateRandom();

        int userGuess = 0;
        int tries = 0;
        boolean outOfGuesses = false;

        userInputValidation.checkUserInput(userGuess, randomNumber, tries, outOfGuesses);
    }
}

class GenerateRandomNumber {

    public int generateRandom() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}

class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getUserInput() {
        int userGuess = -1;
        while (userGuess == -1) {
            try {
                System.out.println("Guess the random number:");
                userGuess = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a valid number between 1 and 10");
                scanner.next();
            }
        }
        return userGuess;
    }

}

class UserInputValidation {

    private UserInput userInput;

    public UserInputValidation(UserInput userInput) {
        this.userInput = userInput;
    }

    public void checkUserInput(int userGuess, int randomNumber, int tries, boolean outOfGuesses) {

        while (userGuess != randomNumber && !outOfGuesses) {
            String hint = userGuess < randomNumber ? "Too low" : "Too high";
            if (tries >= 1) {
                System.out.println("Try again: " + hint);
            }
            userGuess = userInput.getUserInput();
            tries++;
            if (5 - tries == 1) {
                System.out.println("Careful! You have one try left");
            } else {
                System.out.println(String.format("You have %d tries left", 5 - tries));
            }

            if (tries >= 5) {
                outOfGuesses = true;
                System.out.println("Sorry, you are out of guesses! Please try again");
                return;
            }
        }

        System.out.println("Congratulations! You've guessed the number in " + tries + " tries.");
    }
}