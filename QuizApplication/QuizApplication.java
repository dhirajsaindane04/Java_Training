package QuizApplication;

import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'Harry Potter'?",
            "What is the largest ocean on Earth?"
        };

        String[][] options = {
            {"1. Paris", "2. Rome", "3. Madrid", "4. Berlin"},
            {"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"},
            {"1. J.K. Rowling", "2. J.R.R. Tolkien", "3. George R.R. Martin", "4. Suzanne Collins"},
            {"1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"}
        };

        int[] correctAnswers = {1, 2, 1, 4};
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is option " + correctAnswers[i] + ".\n");
            }
        }
        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
