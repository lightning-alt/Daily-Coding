# Daily Coding Challenge - 2026-09-21

## Problem #121
Best Time to Buy and Sell Stock

You are given an array `prices` where `prices[i]` is the price of a given stock on day `i`.

You want to maximize profit by choosing a single day to buy one stock and choosing a later day to sell it.

Return the maximum profit. If you cannot achieve any profit, return `0`.

## Java Solution
```java
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1})); // 0
        System.out.println(solution.maxProfit(new int[]{1, 2, 3, 4, 5})); // 4
    }
}
```

## Explanation
Keep track of the minimum stock price seen so far.

For each new price:
- If the current price is lower than the minimum, update the minimum.
- Otherwise, calculate the profit from selling today and keep the best one.

This works in one pass.

## Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)

## Result
✅ Daily Coding Strike task completed for 2026-09-21
