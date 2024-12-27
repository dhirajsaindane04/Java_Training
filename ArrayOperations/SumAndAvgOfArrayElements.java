package ArrayOperations;

public class SumAndAvgOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        avg = (double) sum / numbers.length;
        System.out.println("Sum of array elements is: " + sum);
        System.out.println("Average of array elements is: " + avg);
    }
}
