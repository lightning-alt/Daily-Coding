"""
Python Functions and Decorators - Daily Coding Practice
This file covers advanced Python function concepts and decorators
"""

# 1. Basic Functions with Default Parameters
print("=== Python Functions and Decorators ===\n")

def greet(name, greeting="Hello"):
    """Function with default parameter"""
    return f"{greeting}, {name}!"

print("--- Basic Functions ---")
print(greet("Alice"))
print(greet("Bob", "Hi"))
print()

# 2. *args - Variable length positional arguments
def sum_numbers(*args):
    """Function that accepts any number of arguments"""
    total = 0
    for num in args:
        total += num
    return total

print("--- *args Example ---")
print(f"sum_numbers(1, 2, 3): {sum_numbers(1, 2, 3)}")
print(f"sum_numbers(10, 20, 30, 40): {sum_numbers(10, 20, 30, 40)}")
print()

# 3. **kwargs - Variable length keyword arguments
def print_info(**kwargs):
    """Function that accepts keyword arguments"""
    for key, value in kwargs.items():
        print(f"  {key}: {value}")

print("--- **kwargs Example ---")
print("Person Info:")
print_info(name="Charlie", age=25, city="New York", job="Developer")
print()

# 4. Lambda Functions - anonymous functions
print("--- Lambda Functions ---")
square = lambda x: x ** 2
multiply = lambda x, y: x * y

print(f"square(5): {square(5)}")
print(f"multiply(3, 4): {multiply(3, 4)}")

# Lambda with map
numbers = [1, 2, 3, 4, 5]
squared = list(map(lambda x: x ** 2, numbers))
print(f"Squares of {numbers}: {squared}")
print()

# 5. Filter - filter elements based on condition
print("--- Filter Function ---")
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print(f"Even numbers from {numbers}: {even_numbers}")
print()

# 6. Reduce - reduce sequence to single value
print("--- Reduce Function ---")
from functools import reduce

numbers = [1, 2, 3, 4, 5]
product = reduce(lambda x, y: x * y, numbers)
print(f"Product of {numbers}: {product}")
print()

# 7. Decorators - function that modifies other functions
print("--- Decorators ---")

def my_decorator(func):
    """Decorator that wraps a function"""
    def wrapper(*args, **kwargs):
        print(f"Calling function: {func.__name__}")
        result = func(*args, **kwargs)
        print(f"Function completed\n")
        return result
    return wrapper

@my_decorator
def say_hello(name):
    return f"Hello, {name}!"

print("Decorated Function:")
output = say_hello("Diana")
print(f"Result: {output}")

# 8. Timer Decorator
print("--- Timer Decorator ---")
import time

def timer_decorator(func):
    """Decorator that measures execution time"""
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(f"Execution time: {end - start:.6f} seconds")
        return result
    return wrapper

@timer_decorator
def slow_function():
    """Simulate slow function"""
    time.sleep(1)
    return "Done!"

print("Timer Decorator Example:")
slow_function()
print()

# 9. Nested Functions - functions inside functions
print("--- Nested Functions ---")

def outer_function(x):
    """Outer function"""
    def inner_function(y):
        """Inner function"""
        return x + y
    return inner_function

add_five = outer_function(5)
print(f"add_five(3): {add_five(3)}")
print(f"add_five(10): {add_five(10)}")
print()

# 10. Closures - functions that capture variables
print("--- Closures ---")

def multiplier(factor):
    """Function that returns a function (closure)"""
    def multiply(x):
        return x * factor
    return multiply

times_three = multiplier(3)
times_five = multiplier(5)

print(f"times_three(10): {times_three(10)}")
print(f"times_five(10): {times_five(10)}")
print()

# 11. First-class functions
print("--- First-class Functions ---")

def apply_function(func, value):
    """Function that takes another function as parameter"""
    return func(value)

result1 = apply_function(lambda x: x ** 2, 5)
result2 = apply_function(lambda x: x * 2, 5)

print(f"apply_function(lambda x: x**2, 5): {result1}")
print(f"apply_function(lambda x: x*2, 5): {result2}")
print()

# 12. Function Composition
print("--- Function Composition ---")

def compose(f, g):
    """Compose two functions"""
    return lambda x: f(g(x))

add_one = lambda x: x + 1
multiply_by_two = lambda x: x * 2

add_then_multiply = compose(multiply_by_two, add_one)
print(f"compose(multiply_by_two, add_one)(5): {add_then_multiply(5)}")
# Result: (5 + 1) * 2 = 12
