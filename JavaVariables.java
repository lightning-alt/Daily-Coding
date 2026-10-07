/**
 * Java Variables and Data Types - Daily Coding Practice
 */
public class JavaVariables {
    public static void main(String[] args) {
        System.out.println("=== Java Variables and Data Types ===");

        byte smallNumber = 12;
        short shortValue = 2000;
        int age = 25;
        long bigNumber = 123456789L;
        float piFloat = 3.14f;
        double piDouble = 3.14159265359;
        char grade = 'A';
        boolean isActive = true;
        String name = "Alice";

        final double TAX_RATE = 0.18;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Small Number: " + smallNumber);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Long Number: " + bigNumber);
        System.out.println("Float Pi: " + piFloat);
        System.out.println("Double Pi: " + piDouble);
        System.out.println("Active: " + isActive);
        System.out.println("Tax Rate: " + TAX_RATE);
    }
}
