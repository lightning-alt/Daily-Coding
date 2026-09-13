/**
 * Java Basics - Daily Coding Practice
 * This file covers fundamental Java concepts
 */

public class JavaBasics {
    
    // Main method - entry point of the program
    public static void main(String[] args) {
        System.out.println("=== Java Basics Tutorial ===\n");
        
        // 1. Variables and Data Types
        demonstrateVariables();
        
        // 2. Control Flow
        demonstrateControlFlow();
        
        // 3. Loops
        demonstrateLoops();
        
        // 4. Arrays
        demonstrateArrays();
        
        // 5. Methods
        int result = add(10, 20);
        System.out.println("\nMethod Example - add(10, 20) = " + result);
    }
    
    // Demonstrate different data types and variables
    static void demonstrateVariables() {
        System.out.println("--- Variables and Data Types ---");
        
        // Primitive data types
        int age = 25;
        double salary = 50000.50;
        boolean isActive = true;
        char grade = 'A';
        String name = "John Doe";
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Active: " + isActive);
        System.out.println("Grade: " + grade + "\n");
    }
    
    // Demonstrate if-else statements
    static void demonstrateControlFlow() {
        System.out.println("--- Control Flow (If-Else) ---");
        
        int score = 85;
        String result;
        
        if (score >= 90) {
            result = "Grade A";
        } else if (score >= 80) {
            result = "Grade B";
        } else if (score >= 70) {
            result = "Grade C";
        } else {
            result = "Grade F";
        }
        
        System.out.println("Score: " + score + " -> " + result + "\n");
    }
    
    // Demonstrate loops
    static void demonstrateLoops() {
        System.out.println("--- Loops ---");
        
        // For loop
        System.out.println("For Loop (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        
        // While loop
        System.out.println("\n\nWhile Loop (countdown from 5):");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        
        // Enhanced for loop
        System.out.println("\n\nEnhanced For Loop:\n");
    }
    
    // Demonstrate arrays
    static void demonstrateArrays() {
        System.out.println("--- Arrays ---");
        
        // Integer array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        // Find max
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("\nMax value: " + max + "\n");
    }
    
    // Simple method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method for doubles
    static double add(double a, double b) {
        return a + b;
    }
}
