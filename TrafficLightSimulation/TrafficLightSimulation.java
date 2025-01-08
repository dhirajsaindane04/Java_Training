package TrafficLightSimulation;
import java.util.Scanner;
public class TrafficLightSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the traffic light color (Red, Yellow, or Green): ");
        String trafficLightColor = scanner.nextLine().toLowerCase(); 
        switch (trafficLightColor) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Get Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid input. Please enter Red, Yellow, or Green.");
                break;
        }
        scanner.close();
    }
}

