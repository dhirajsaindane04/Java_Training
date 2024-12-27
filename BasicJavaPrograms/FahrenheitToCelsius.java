package BasicJavaPrograms;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);
    System.out.print("Enter the temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
    System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
    scanner.close();
}}
