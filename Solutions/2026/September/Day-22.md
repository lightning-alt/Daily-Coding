# Daily Coding Challenge - 2026-09-22

## Problem #122
Contains Duplicate

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Java Solution
```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(solution.containsDuplicate(new int[]{1, 2, 3, 4})); // false
        System.out.println(solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true
    }
}
```

## Explanation
A `HashSet` stores unique values only.

While iterating through the array:
- if a value already exists in the set, then a duplicate is found
- otherwise, add it to the set

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(n)

## Result
✅ Daily Coding Strike task completed for 2026-09-22
