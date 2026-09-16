/**
 * Java String Operations - Daily Coding Practice
 * This file covers string manipulation, methods, and best practices
 */

public class StringOperations {
    
    public static void main(String[] args) {
        System.out.println("=== Java String Operations ===\n");
        
        // 1. String basics
        demonstrateStringBasics();
        
        // 2. String methods
        demonstrateStringMethods();
        
        // 3. String comparison
        demonstrateStringComparison();
        
        // 4. String builder
        demonstrateStringBuilder();
        
        // 5. String formatting
        demonstrateStringFormatting();
        
        // 6. String searching
        demonstrateStringSearching();
    }
    
    // String basics
    static void demonstrateStringBasics() {
        System.out.println("--- String Basics ---");
        
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = "Hello";  // Same as str1
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("Length: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));
        System.out.println();
    }
    
    // String methods
    static void demonstrateStringMethods() {
        System.out.println("--- String Methods ---");
        
        String text = "Java Programming";
        
        System.out.println("Original: " + text);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring (0, 4): " + text.substring(0, 4));
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        System.out.println("Trim '  Hello  ': '" + "  Hello  ".trim() + "'");
        System.out.println("StartsWith 'Java': " + text.startsWith("Java"));
        System.out.println("EndsWith 'ing': " + text.endsWith("ing"));
        System.out.println("Contains 'Pro': " + text.contains("Pro"));
        System.out.println();
    }
    
    // String comparison
    static void demonstrateStringComparison() {
        System.out.println("--- String Comparison ---");
        
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("str1 == str2: " + (str1 == str2));           // true (same reference)
        System.out.println("str1 == str3: " + (str1 == str3));           // false (different objects)
        System.out.println("str1.equals(str3): " + str1.equals(str3));   // true (same content)
        System.out.println("str1.equalsIgnoreCase('hello'): " + str1.equalsIgnoreCase("hello"));
        System.out.println("str1.compareTo('hello'): " + str1.compareTo("hello"));
        System.out.println();
    }
    
    // StringBuilder - mutable string
    static void demonstrateStringBuilder() {
        System.out.println("--- StringBuilder ---");
        
        StringBuilder sb = new StringBuilder("Hello");
        
        System.out.println("Original: " + sb);
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);
        sb.replace(6, 15, "Amazing");
        System.out.println("After replace: " + sb);
        sb.delete(0, 6);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("Final String: " + sb.toString());
        System.out.println();
    }
    
    // String formatting
    static void demonstrateStringFormatting() {
        System.out.println("--- String Formatting ---");
        
        String name = "Alice";
        int age = 25;
        double salary = 50000.50;
        
        // Using printf
        System.out.printf("Name: %s, Age: %d, Salary: $%.2f\n", name, age, salary);
        
        // Using format
        String formatted = String.format("Employee: %s (Age: %d)", name, age);
        System.out.println(formatted);
        
        // Using concatenation
        String concat = name + " is " + age + " years old";
        System.out.println(concat);
        System.out.println();
    }
    
    // String searching
    static void demonstrateStringSearching() {
        System.out.println("--- String Searching ---");
        
        String text = "The quick brown fox jumps over the lazy dog";
        
        System.out.println("Text: " + text);
        System.out.println("Index of 'quick': " + text.indexOf("quick"));
        System.out.println("Last index of 'the': " + text.lastIndexOf("the"));
        System.out.println("Index of 'z': " + text.indexOf('z'));
        
        // Split string
        String[] words = text.split(" ");
        System.out.println("Words: " + java.util.Arrays.toString(words));
        
        // Join strings
        String joined = String.join("-", "Java", "Python", "JavaScript");
        System.out.println("Joined: " + joined);
    }
}
