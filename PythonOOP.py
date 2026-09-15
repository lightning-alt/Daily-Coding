"""
Python Object-Oriented Programming - Daily Coding Practice
This file covers OOP concepts in Python: classes, inheritance, polymorphism, encapsulation
"""

print("=== Python Object-Oriented Programming ===\n")

# 1. Basic Class Definition with Encapsulation
print("--- Classes and Encapsulation ---")

class Person:
    """Base class for Person"""
    
    # Class variable (shared by all instances)
    species = "Homo sapiens"
    
    def __init__(self, name, age, email):
        """Constructor - initialize instance variables"""
        # Private attributes (convention: single underscore)
        self._name = name
        self._age = age
        self._email = email
    
    # Getter methods
    @property
    def name(self):
        return self._name
    
    @property
    def age(self):
        return self._age
    
    @property
    def email(self):
        return self._email
    
    # Setter methods
    @age.setter
    def age(self, value):
        if value > 0:
            self._age = value
        else:
            print("Age must be positive!")
    
    def display_info(self):
        """Instance method"""
        print(f"Name: {self._name}, Age: {self._age}, Email: {self._email}")
    
    @classmethod
    def from_birth_year(cls, name, birth_year, email):
        """Class method - alternative constructor"""
        age = 2026 - birth_year
        return cls(name, age, email)
    
    @staticmethod
    def is_adult(age):
        """Static method - doesn't use instance or class data"""
        return age >= 18


# Create instances
person1 = Person("Alice", 30, "alice@example.com")
person2 = Person("Bob", 25, "bob@example.com")

print("Person 1:")
person1.display_info()
print(f"Is adult? {Person.is_adult(person1.age)}")
print()

# Using class method
person3 = Person.from_birth_year("Charlie", 1995, "charlie@example.com")
print("Person 3 (from birth year):")
person3.display_info()
print()

# 2. Inheritance - Single Inheritance
print("--- Inheritance ---")

class Employee(Person):
    """Employee inherits from Person"""
    
    def __init__(self, name, age, email, employee_id, department):
        super().__init__(name, age, email)  # Call parent constructor
        self.employee_id = employee_id
        self.department = department
    
    def display_info(self):
        """Overriding parent method"""
        super().display_info()
        print(f"Employee ID: {self.employee_id}, Department: {self.department}")
    
    def work(self):
        print(f"{self._name} is working in {self.department}")


employee1 = Employee("Diana", 28, "diana@example.com", "E001", "Engineering")
print("Employee Info:")
employee1.display_info()
employee1.work()
print()

# 3. Multiple Inheritance
print("--- Multiple Inheritance ---")

class Programmer:
    """Mixin class for programming skills"""
    
    def __init__(self):
        self.languages = []
    
    def add_language(self, language):
        self.languages.append(language)
    
    def code(self):
        return f"Programming in {', '.join(self.languages)}"


class Manager:
    """Mixin class for management skills"""
    
    def __init__(self):
        self.team_size = 0
    
    def set_team_size(self, size):
        self.team_size = size
    
    def manage(self):
        return f"Managing a team of {self.team_size} people"


class TechLead(Employee, Programmer, Manager):
    """Tech Lead inherits from Employee, Programmer, and Manager"""
    
    def __init__(self, name, age, email, employee_id, department):
        Employee.__init__(self, name, age, email, employee_id, department)
        Programmer.__init__(self)
        Manager.__init__(self)


tech_lead = TechLead("Eve", 32, "eve@example.com", "E002", "Engineering")
tech_lead.add_language("Python")
tech_lead.add_language("Java")
tech_lead.set_team_size(5)

print("Tech Lead Info:")
print(tech_lead.code())
print(tech_lead.manage())
print()

# 4. Polymorphism
print("--- Polymorphism ---")

class Animal:
    def speak(self):
        pass


class Dog(Animal):
    def speak(self):
        return "Woof! Woof!"


class Cat(Animal):
    def speak(self):
        return "Meow! Meow!"


class Bird(Animal):
    def speak(self):
        return "Tweet! Tweet!"


# Polymorphism in action
animals = [Dog(), Cat(), Bird()]
print("Animal sounds:")
for animal in animals:
    print(f"  {animal.__class__.__name__}: {animal.speak()}")
print()

# 5. Abstract Base Class
print("--- Abstract Base Classes ---")

from abc import ABC, abstractmethod

class Vehicle(ABC):
    """Abstract base class"""
    
    @abstractmethod
    def start(self):
        pass
    
    @abstractmethod
    def stop(self):
        pass


class Car(Vehicle):
    def start(self):
        return "Car engine started"
    
    def stop(self):
        return "Car engine stopped"


class Motorcycle(Vehicle):
    def start(self):
        return "Motorcycle engine started"
    
    def stop(self):
        return "Motorcycle engine stopped"


# Cannot instantiate abstract class
# vehicle = Vehicle()  # This would raise TypeError

car = Car()
motorcycle = Motorcycle()

print("Vehicles:")
print(f"Car: {car.start()}, {car.stop()}")
print(f"Motorcycle: {motorcycle.start()}, {motorcycle.stop()}")
print()

# 6. Properties and Decorators
print("--- Properties and Decorators ---")

class BankAccount:
    """Bank account with property decorators"""
    
    def __init__(self, balance=0):
        self._balance = balance
    
    @property
    def balance(self):
        """Getter for balance"""
        return self._balance
    
    @balance.setter
    def balance(self, amount):
        """Setter for balance"""
        if amount >= 0:
            self._balance = amount
        else:
            print("Balance cannot be negative!")
    
    def deposit(self, amount):
        if amount > 0:
            self._balance += amount
            print(f"Deposited: ${amount}. New balance: ${self._balance}")
        else:
            print("Deposit amount must be positive!")
    
    def withdraw(self, amount):
        if 0 < amount <= self._balance:
            self._balance -= amount
            print(f"Withdrew: ${amount}. New balance: ${self._balance}")
        else:
            print("Invalid withdrawal amount!")


account = BankAccount(1000)
print(f"Initial balance: ${account.balance}")
account.deposit(500)
account.withdraw(200)
print()

# 7. String Representation
print("--- String Representation ---")

class Student:
    def __init__(self, name, student_id, gpa):
        self.name = name
        self.student_id = student_id
        self.gpa = gpa
    
    def __str__(self):
        """User-friendly string representation"""
        return f"Student: {self.name} (ID: {self.student_id}, GPA: {self.gpa})"
    
    def __repr__(self):
        """Developer-friendly representation"""
        return f"Student('{self.name}', '{self.student_id}', {self.gpa})"


student = Student("Frank", "S001", 3.8)
print(f"str(): {str(student)}")
print(f"repr(): {repr(student)}")
