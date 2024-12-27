package BasicJavaPrograms;
import java.util.Scanner;
public class TrafficLight {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color of the traffic light: ");
        String lightColor = scanner.nextLine();
        boolean obstacle = false;
        if (obstacle) {
            System.out.println("Stop, there's an obstacle!");
        } else {
            if (lightColor.equals("Green") || lightColor.equals("green")) {
                System.out.println("Go");
            } else if (lightColor.equals("Yellow") || lightColor.equals("yellow")) {
                System.out.println("Slow Down");
            } else if (lightColor.equals("Red") || lightColor.equals("red")) {
                System.out.println("Stop");
            } else {
                System.out.println("Invalid light color");
            }
            scanner.close();
        }
    
    }
}