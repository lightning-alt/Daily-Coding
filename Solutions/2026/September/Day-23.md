# Daily Coding Challenge - 2026-09-23

## Problem #123
Single Number

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

## Java Solution
```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int sum = 0;

        for (int num : nums) {
            if (!seen.add(num)) {
                sum -= num;
            } else {
                sum += num;
            }
        }

        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.singleNumber(new int[]{2, 2, 1}));       // 1
        System.out.println(solution.singleNumber(new int[]{4, 1, 2, 1, 2})); // 4
        System.out.println(solution.singleNumber(new int[]{1}));            // 1
    }
}
```

## Explanation
A `HashSet` tracks numbers seen so far.

- If a number is seen again, remove its contribution
- If it appears only once, keep its contribution

This works because every number appears twice except one.

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(n)

## Result
✅ Daily Coding Strike task completed for 2026-09-23
