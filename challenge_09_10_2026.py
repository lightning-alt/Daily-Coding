"""
Daily Strike Coding Challenge - September 10, 2026
Three problems to solve today!
"""

# Problem 1: Two Sum
# Given an array of integers nums and an integer target, 
# return the indices of the two numbers that add up to target.
def two_sum(nums, target):
    """
    Example:
    nums = [2, 7, 11, 15], target = 9
    Output: [0, 1]  # nums[0] + nums[1] == 9
    """
    seen = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in seen:
            return [seen[complement], i]
        seen[num] = i
    return []


# Problem 2: Palindrome Number
# Determine if an integer is a palindrome (reads the same forwards and backwards)
def is_palindrome(n):
    """
    Example:
    is_palindrome(121) -> True
    is_palindrome(-121) -> False
    is_palindrome(10) -> False
    """
    if n < 0:
        return False
    original = n
    reversed_num = 0
    while n > 0:
        reversed_num = reversed_num * 10 + n % 10
        n //= 10
    return original == reversed_num


# Problem 3: Reverse String
# Reverse a string in-place
def reverse_string(s):
    """
    Example:
    s = ['h', 'e', 'l', 'l', 'o']
    After: ['o', 'l', 'l', 'e', 'h']
    """
    left, right = 0, len(s) - 1
    while left < right:
        s[left], s[right] = s[right], s[left]
        left += 1
        right -= 1
    return s


# Test cases
if __name__ == "__main__":
    # Test Problem 1
    print("Problem 1 - Two Sum:")
    print(two_sum([2, 7, 11, 15], 9))  # [0, 1]
    
    # Test Problem 2
    print("\nProblem 2 - Palindrome Number:")
    print(is_palindrome(121))  # True
    print(is_palindrome(-121))  # False
    
    # Test Problem 3
    print("\nProblem 3 - Reverse String:")
    s = ['h', 'e', 'l', 'l', 'o']
    print(reverse_string(s))  # ['o', 'l', 'l', 'e', 'h']
