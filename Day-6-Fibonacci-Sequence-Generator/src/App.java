import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("##FIBONACCI SEQUENCE GENERATOR##");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int terms = scanner.nextInt();

        for (int i = 0; i < terms; i++) {
            System.out.print(Fibonacci.fibonacci(i) + " ");
        }

        scanner.close();
    }
}

class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int prev1 = 1; // value of fibonacci(1)
        int prev2 = 0; // Value of fibonacci(0)
        int current = 0; // fibonacci(n)

        for (int i = 2; i <= n; i++) {
            // Calculate the next term
            current = prev1 + prev2;

            prev2 = prev1; // Shift prev1 to prev2
            prev1 = current; // Update prev1 to the new current
        }

        return current;
    }
}