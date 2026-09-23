import java.util.HashSet;
import java.util.Set;

/**
 * Daily coding practice for 2026-09-23.
 * Checks whether an array contains any repeated values.
 */
public class Challenge0923ContainsDuplicate {
    public static boolean containsDuplicate(int[] numbers) {
        Set<Integer> seen = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}
