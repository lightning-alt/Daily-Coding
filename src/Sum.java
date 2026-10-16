public class Sum {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Sum <num1> <num2>");
            return;
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a + b);
        } catch (NumberFormatException e) {
            System.out.println("Both arguments must be integers.");
        }
    }
}
