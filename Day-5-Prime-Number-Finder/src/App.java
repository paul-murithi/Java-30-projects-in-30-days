import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("PRIME NUMBER CHECKER!");

        System.out.println("1: Check if a number is prime: ");
        System.out.println("2: Print prime numbers to a specific range: ");

        int choice = sc.nextInt();
        userInput userInput = new userInput(sc);
        userInput.getInput(choice);

        sc.close();
    }

}

class userInput {
    private Scanner scanner;

    public userInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public void getInput(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Enter a number to check if it is prime: ");
                int n = scanner.nextInt();
                boolean isPrime = new CheckPrime().isPrime(n);
                if (isPrime) {
                    System.out.println(n + " is a prime number.");
                } else {
                    System.out.println(n + " is not a prime number.");
                }
                break;
            case 2:
                System.out.println("Print prime numbers! Enter max range: ");
                int maxRange = scanner.nextInt();
                for (int i = 2; i <= maxRange; i++) {
                    if (new CheckPrime().isPrime(i)) {
                        System.out.println("Prime number: " + i);
                    }
                }
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

    }
}

class CheckPrime {
    public boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println("Invalid input. Please enter a number greater than 1.");
            return false;
        }

        long startTime = System.nanoTime();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                long endTime = System.nanoTime();
                long timeTaken = endTime - startTime;
                System.out.println("Time taken to calculate isPrime: " + timeTaken + " nanoseconds");
                return false;
            }
        }

        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken to calculate isPrime: " + timeTaken + " nanoseconds");

        return true;
    }

}
