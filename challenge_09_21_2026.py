"""
Daily Strike Coding Challenge - September 21, 2026
Three Python problems to solve today!
"""

# Problem 1: Valid Anagram
# Given two strings s and t, determine if they are anagrams of each other.
def is_anagram(s: str, t: str) -> bool:
    """
    Example:
    is_anagram("listen", "silent") -> True
    is_anagram("hello", "world") -> False
    """
    if len(s) != len(t):
        return False

    counts = {}
    for ch in s:
        counts[ch] = counts.get(ch, 0) + 1

    for ch in t:
        if ch not in counts:
            return False
        counts[ch] -= 1
        if counts[ch] < 0:
            return False

    return all(value == 0 for value in counts.values())


# Problem 2: Best Time to Buy and Sell Stock
# Return the maximum profit you can achieve by choosing one buy day and one sell day.
def max_profit(prices):
    """
    Example:
    prices = [7, 1, 5, 3, 6, 4]
    Output: 5
    """
    if not prices:
        return 0

    min_price = prices[0]
    best_profit = 0

    for price in prices[1:]:
        min_price = min(min_price, price)
        best_profit = max(best_profit, price - min_price)

    return best_profit


# Problem 3: Group Anagrams
# Given an array of strings, group the anagrams together.
def group_anagrams(words):
    """
    Example:
    words = ["eat", "tea", "tan", "ate", "nat", "bat"]
    Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
    """
    grouped = {}

    for word in words:
        key = ''.join(sorted(word))
        grouped.setdefault(key, []).append(word)

    return list(grouped.values())


# Test cases
if __name__ == "__main__":
    print("Problem 1 - Valid Anagram:")
    print(is_anagram("listen", "silent"))  # True
    print(is_anagram("hello", "world"))    # False

    print("\nProblem 2 - Best Time to Buy and Sell Stock:")
    print(max_profit([7, 1, 5, 3, 6, 4]))  # 5
    print(max_profit([7, 6, 4, 3, 1]))      # 0

    print("\nProblem 3 - Group Anagrams:")
    print(group_anagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
    # [['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]
