/**
 * Java Operators - Daily Coding Practice
 */
public class JavaOperators {
    public static void main(String[] args) {
        System.out.println("=== Java Operators ===");
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        a++;
        b--;
        System.out.println("After increment/decrement: a=" + a + ", b=" + b);

        boolean cmp = (a > b) && (b > 0);
        System.out.println("a>b && b>0: " + cmp);

        int example = a + b * (a - b);
        System.out.println("Example expression result: " + example);
    }
}
