import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Guess a number between 1 and 10: ");
        int guess = input.nextInt();

        if (guess == secret) {
            System.out.println("Correct! You guessed it.");
        } else {
            System.out.println("Wrong! The number was " + secret);
        }

        input.close();
    }
}
