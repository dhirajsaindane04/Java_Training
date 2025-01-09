package LotteryNumberGenerator;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LotteryNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lottery numbers to generate: ");
        int n = scanner.nextInt();
        int min = 1;
        int max = 50;
        HashSet<Integer> lotteryNumbers = new HashSet<>();
        Random random = new Random();
        while (lotteryNumbers.size() < n) {
            int lotteryNumber = random.nextInt(max - min + 1) + min;  
            lotteryNumbers.add(lotteryNumber); 
        }
        System.out.println("Generated Lottery Numbers: ");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }
        scanner.close();
    }
}
