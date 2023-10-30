import java.util.Scanner;
import java.security.SecureRandom;

public class multiplication {
    private SecureRandom randomNumbers = new SecureRandom();
    private int correctAnswers = 0;

    public void createQuestion() {
        int digit1 = randomNumbers.nextInt(10) + 1;
        int digit2 = randomNumbers.nextInt(10) + 1 ;
        int answer = digit1 * digit2;

        System.out.printf("How much is %d times %d?%n", digit1, digit2);
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if (guess == answer) {
            System.out.println("Correct!");
            correctAnswers++;
        } else {
            System.out.println("Incorrect!");
        }
    }

    public void runQuiz() {
        Scanner input = new Scanner(System.in);

        while (correctAnswers < 10) {
            correctAnswers = 0;

            for (int i = 0; i < 10; i++) {
                createQuestion();
            }

            System.out.println("You scored " + correctAnswers + " out of 10.");

            if (correctAnswers == 10) {
                System.out.println("Congratulations! You've got 10 answers correct in a row!");
            } else {
                System.out.println("Let's try again.");
            }

            System.out.print("Enter 'q' to quit or any key to continue: ");
            String quit = input.next();

            if ("q".equalsIgnoreCase(quit)) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        multiplication quiz = new multiplication();
        quiz.runQuiz();
    }
}
