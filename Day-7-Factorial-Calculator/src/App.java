import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("##FACTORIAL CALCULATOR##");

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Factorial of " + n + " is: " + Factorial.factorial(n));

    }
}

class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}