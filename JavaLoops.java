/**
 * Java Loops and Arrays - Daily Coding Practice
 */
public class JavaLoops {
    public static void main(String[] args) {
        System.out.println("=== Java Loops and Arrays ===");

        // For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop
        System.out.println("While loop:");
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // Do-while loop
        System.out.println("Do-while loop:");
        int number = 1;
        do {
            System.out.print(number + " ");
            number++;
        } while (number <= 5);
        System.out.println();

        // Array example
        int[] scores = {90, 85, 88, 92, 95};
        System.out.println("Array values:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        int total = 0;
        for (int score : scores) {
            total += score;
        }

        double average = total / (double) scores.length;
        System.out.println("Average score: " + average);
    }
}
