import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        System.out.println("\nFibonacci Sequence:");
        printFibonacci(n);
        
        scanner.close();
    }
    
    public static void printFibonacci(int n) {
        long first = 0, second = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
