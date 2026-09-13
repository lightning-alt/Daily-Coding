/**
 * Python Data Structures - Daily Coding Practice
 * This file covers fundamental Python data structures and operations
 */

# Lists - ordered, mutable collections
print("=== Python Data Structures ===\n")

# 1. Lists
print("--- Lists ---")
fruits = ["apple", "banana", "cherry", "date"]
print(f"Original list: {fruits}")
fruits.append("elderberry")
print(f"After append: {fruits}")
fruits.remove("banana")
print(f"After remove: {fruits}")
print(f"List length: {len(fruits)}\n")

# 2. Tuples - ordered, immutable collections
print("--- Tuples ---")
colors = ("red", "green", "blue", "yellow")
print(f"Tuple: {colors}")
print(f"First color: {colors[0]}")
print(f"Tuple length: {len(colors)}\n")

# 3. Dictionaries - key-value pairs
print("--- Dictionaries ---")
student = {
    "name": "Alice",
    "age": 20,
    "major": "Computer Science",
    "GPA": 3.8
}
print(f"Student info: {student}")
print(f"Name: {student['name']}")
student["semester"] = "Fall 2024"
print(f"After adding semester: {student}\n")

# 4. Sets - unordered, unique elements
print("--- Sets ---")
numbers = {1, 2, 3, 4, 5, 3, 2}  # Duplicates removed
print(f"Set: {numbers}")
numbers.add(6)
print(f"After add(6): {numbers}")
print(f"Is 3 in set? {3 in numbers}\n")

# 5. String Operations
print("--- String Operations ---")
text = "Hello World"
print(f"Original: {text}")
print(f"Uppercase: {text.upper()}")
print(f"Lowercase: {text.lower()}")
print(f"Replace: {text.replace('World', 'Python')}")
print(f"Split: {text.split()}\n")

# 6. List Comprehension
print("--- List Comprehension ---")
squares = [x**2 for x in range(1, 6)]
print(f"Squares 1-5: {squares}")
evens = [x for x in range(1, 11) if x % 2 == 0]
print(f"Even numbers 1-10: {evens}\n")

# 7. Functions
print("--- Functions ---")

def greet(name, greeting="Hello"):
    """Function with default parameters"""
    return f"{greeting}, {name}!"

print(greet("Bob"))
print(greet("Charlie", "Hi"))

# Lambda function
square = lambda x: x ** 2
print(f"Lambda square(5): {square(5)}\n")

# 8. Loops and Conditionals
print("--- Loops and Conditionals ---")
for i in range(1, 4):
    print(f"Loop iteration {i}")

numbers_list = [10, 20, 30, 40, 50]
total = 0
for num in numbers_list:
    total += num
print(f"Sum of {numbers_list}: {total}\n")

# 9. Exception Handling
print("--- Exception Handling ---")
try:
    result = 10 / 2
    print(f"10 / 2 = {result}")
    invalid = 10 / 0  # This will raise an error
except ZeroDivisionError:
    print("Error: Cannot divide by zero!")
finally:
    print("Exception handling complete.\n")

# 10. File Operations (simulated)
print("--- Data Processing ---")
data = [
    {"id": 1, "name": "Alice", "score": 95},
    {"id": 2, "name": "Bob", "score": 87},
    {"id": 3, "name": "Charlie", "score": 92}
]

print("Student Scores:")
for student in data:
    print(f"  {student['name']}: {student['score']}")

avg_score = sum(s["score"] for s in data) / len(data)
print(f"Average Score: {avg_score:.2f}")
