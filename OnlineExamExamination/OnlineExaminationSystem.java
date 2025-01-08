package OnlineExamExamination;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswer;

    public Question(String questionText, List<String> options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    public boolean isCorrectAnswer(int userAnswer) {
        return userAnswer - 1 == correctAnswer; 
    }
}

class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Quiz!");
        System.out.println("Answer the questions by entering the number of your choice.\n");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Question " + (i + 1) + ":");
            questions.get(i).displayQuestion();
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (questions.get(i).isCorrectAnswer(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong answer.\n");
            }
        }

        System.out.println("Quiz completed!");
        System.out.println("Your final score is: " + score + " out of " + questions.size());
        scanner.close();
    }
}

// Main.java
public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        List<String> options1 = List.of("Java", "Python", "C++", "JavaScript");
        quiz.addQuestion(new Question("Which programming language is platform-independent?", options1, 0));

        List<String> options2 = List.of("1991", "1985", "2000", "1970");
        quiz.addQuestion(new Question("In which year was Python developed?", options2, 0));

        List<String> options3 = List.of("HyperText Transfer Protocol", "HyperText Markup Language", "HyperTransfer Mechanism Language", "None of the above");
        quiz.addQuestion(new Question("What does HTTP stand for?", options3, 0));

        // Start the quiz
        quiz.start();
    }
}
