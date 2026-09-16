/**
 * Java Exception Handling - Daily Coding Practice
 * This file covers try-catch-finally, custom exceptions, and exception handling best practices
 */

import java.util.Scanner;
import java.io.*;

public class ExceptionHandling {
    
    public static void main(String[] args) {
        System.out.println("=== Java Exception Handling ===\n");
        
        // 1. Basic try-catch
        demonstrateTryCatch();
        
        // 2. Multiple catch blocks
        demonstrateMultipleCatch();
        
        // 3. Try-catch-finally
        demonstrateTryCatchFinally();
        
        // 4. Custom exceptions
        demonstrateCustomExceptions();
        
        // 5. Throwing exceptions
        demonstrateThrowingExceptions();
        
        // 6. Try-with-resources
        demonstrateTryWithResources();
    }
    
    // Basic try-catch
    static void demonstrateTryCatch() {
        System.out.println("--- Basic Try-Catch ---");
        try {
            int result = 10 / 2;
            System.out.println("10 / 2 = " + result);
            
            int invalid = 10 / 0;  // Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
    }
    
    // Multiple catch blocks
    static void demonstrateMultipleCatch() {
        System.out.println("--- Multiple Catch Blocks ---");
        
        String[] numbers = {"10", "20", "abc", "30"};
        
        for (String num : numbers) {
            try {
                int value = Integer.parseInt(num);
                int result = 100 / value;
                System.out.println("100 / " + value + " = " + result);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number format - " + num);
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero");
            }
        }
        System.out.println();
    }
    
    // Try-catch-finally
    static void demonstrateTryCatchFinally() {
        System.out.println("--- Try-Catch-Finally ---");
        
        try {
            System.out.println("Opening resource...");
            int[] arr = {1, 2, 3};
            System.out.println("Element at index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } finally {
            System.out.println("Finally block - cleanup code executed");
        }
        System.out.println();
    }
    
    // Custom exception class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    
    // Custom exceptions
    static void demonstrateCustomExceptions() {
        System.out.println("--- Custom Exceptions ---");
        
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        try {
            validateAge(25);
            System.out.println("Age validation successful!");
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println();
    }
    
    // Throwing exceptions
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18. Current age: " + age);
        }
    }
    
    static void demonstrateThrowingExceptions() {
        System.out.println("--- Throwing Exceptions ---");
        
        try {
            int age = 20;
            if (age >= 0) {
                System.out.println("Valid age: " + age);
            } else {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        System.out.println();
    }
    
    // Try-with-resources (automatically closes resources)
    static void demonstrateTryWithResources() {
        System.out.println("--- Try-With-Resources ---");
        
        String data = "Hello World";
        
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data.getBytes())) {
            System.out.println("Resource opened");
            byte[] buffer = new byte[5];
            int bytesRead = bais.read(buffer);
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
        // Resource automatically closed
        System.out.println("Resource automatically closed");
    }
}
