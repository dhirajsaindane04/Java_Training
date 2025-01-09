package SensorDataMonitoring;

import java.util.Random;

public class SensorDataMonitoring {

    public static void main(String[] args) {
        int threshold = 80;
        int readingsCount = 0;
        int highestValue = Integer.MIN_VALUE;
        Random random = new Random();
        while (true) {
            int sensorValue = random.nextInt(101); 
            readingsCount++;
            
            if (sensorValue > highestValue) {
                highestValue = sensorValue;
            }
            System.out.println("Reading " + readingsCount + ": " + sensorValue);
            if (sensorValue > threshold) {
                System.out.println("Sensor value exceeds threshold of " + threshold + ". Stopping monitoring.");
                break;
            }
        }
        System.out.println("\nTotal Readings Taken: " + readingsCount);
        System.out.println("Highest Sensor Value Recorded: " + highestValue);
    }
}
