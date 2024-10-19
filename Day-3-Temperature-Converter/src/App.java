import java.util.Scanner;

// Abstract class to define the basic structure for a Temperature Converter
abstract class TemperatureConverter {
    abstract double convert(double temperature);
}

// Celsius to Fahrenheit converter
class CelsiusToFahrenheit extends TemperatureConverter {
    @Override
    double convert(double temperature) {
        return (temperature * 9 / 5) + 32;
    }
}

// Fahrenheit to Celsius converter
class FahrenheitToCelsius extends TemperatureConverter {
    @Override
    double convert(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}

// Celsius to Kelvin converter
class CelsiusToKelvin extends TemperatureConverter {
    @Override
    double convert(double temperature) {
        return temperature + 273.15;
    }
}

// Kelvin to Celsius converter
class KelvinToCelsius extends TemperatureConverter {
    @Override
    double convert(double temperature) {
        return temperature - 273.15;
    }
}

// Fahrenheit to Kelvin converter
class FahrenheitToKelvin extends TemperatureConverter {
    @Override
    double convert(double temperature) {
        return (temperature - 32) * 5 / 9 + 273.15;
    }
}

// Kelvin to Fahrenheit converter
class KelvinToFahrenheit extends TemperatureConverter {
    @Override
    double convert(double temperature) {
        return (temperature - 273.15) * 9 / 5 + 32;
    }
}

// Class to handle the user interface and input validation
class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");

        // Input temperature
        System.out.print("Enter the temperature value: ");
        double temperature = validateTemperatureInput(scanner);

        // Input conversion type
        System.out.println("Select conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");

        int choice = validateConversionChoice(scanner);

        // Perform conversion based on user's choice
        TemperatureConverter converter = getConverter(choice);
        double result = converter.convert(temperature);

        // Display result
        System.out.println("Converted temperature: " + result);
    }

    // Method to validate and return temperature input
    private static double validateTemperatureInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a valid temperature: ");
            scanner.next(); // clear invalid input
        }
        return scanner.nextDouble();
    }

    // Method to validate and return conversion choice
    private static int validateConversionChoice(Scanner scanner) {
        int choice;
        do {
            System.out.print("Enter your choice (1-6): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number between 1 and 6: ");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 6);
        return choice;
    }

    // Factory method to get the appropriate converter based on user choice
    private static TemperatureConverter getConverter(int choice) {
        switch (choice) {
            case 1:
                return new CelsiusToFahrenheit();
            case 2:
                return new FahrenheitToCelsius();
            case 3:
                return new CelsiusToKelvin();
            case 4:
                return new KelvinToCelsius();
            case 5:
                return new FahrenheitToKelvin();
            case 6:
                return new KelvinToFahrenheit();
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }
}
