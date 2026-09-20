# Daily Coding Challenge - 2026-09-20

## Problem #120
Valid Parentheses: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

A string is valid if:
- Open brackets must be closed by the same type of bracket.
- Open brackets must be closed in the correct order.
- Every closing bracket has a corresponding opening bracket earlier in the string.

## Java Solution
```java
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("()"));       // true
        System.out.println(solution.isValid("()[]{}"));  // true
        System.out.println(solution.isValid("(]"));      // false
        System.out.println(solution.isValid("([)]"));    // false
    }
}
```

## Explanation
We use a stack to keep track of opening brackets. Each time we see a closing bracket, we check whether it matches the most recent opening bracket at the top of the stack.

If the stack is empty at any point when a closing bracket appears, or the types do not match, the string is invalid.

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(n)

## Result
✅ Daily Coding Strike task completed for 2026-09-20
