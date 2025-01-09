package DailyStepTracker;

import java.util.Scanner;

public class DailyStepTracker {

    public static void main(String[] args) {
        int daysInWeek = 7;
        int[] steps = new int[daysInWeek];
        int totalSteps = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < daysInWeek; i++) {
            System.out.print("Enter the number of steps taken on day " + (i + 1) + ": ");
            steps[i] = scanner.nextInt();
            totalSteps += steps[i];
        }
        double averageSteps = (double) totalSteps / daysInWeek;
        System.out.println("\nTotal steps taken in the week: " + totalSteps);
        System.out.println("Average steps taken per day: " + averageSteps);
        scanner.close();
    }
}
