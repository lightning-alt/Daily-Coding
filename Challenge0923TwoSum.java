import java.util.HashMap;
import java.util.Map;

/**
 * Daily coding practice for 2026-09-23.
 * Finds the indices of two values whose sum equals the target.
 */
public class Challenge0923TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(numbers[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.printf("Indices: [%d, %d]%n", result[0], result[1]);
    }
}
