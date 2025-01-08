package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        double temperature, convertedTemperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature * 9/5) + 32;
                System.out.println(temperature + "°C is equal to " + convertedTemperature + "°F");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                convertedTemperature = (temperature - 32) * 5/9;
                System.out.println(temperature + "°F is equal to " + convertedTemperature + "°C");
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }
        scanner.close();
    }
}

