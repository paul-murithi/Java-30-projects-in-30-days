import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double firstNumber;
        double secondNumber;
        String operand;
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.println("##BASIC CALCULATOR##");
            System.out.println("Enter first number: ");
            firstNumber = scanner.nextDouble();

            System.out.println("Enter second number: ");
            secondNumber = scanner.nextDouble();

            System.out.println("Enter an operand (+, -,*, /): ");
            operand = scanner.next();
        } finally {
            scanner.close();
        }

        System.out.println("The result is: " + calculator.calculate(firstNumber, secondNumber, operand));
    }
}

class Calculator {
    public double calculate(double firstNumber, double secondNumber, String operand) {
        switch (operand) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber != 0) {
                    return firstNumber / secondNumber;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return 0;
                }
            default:
                System.out.println("An error occurred! Please enter a valid operand.");
                return 0;
        }
    }

}