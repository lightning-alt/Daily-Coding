/**
 * Java Object-Oriented Programming - Daily Coding Practice
 * This file covers OOP concepts: classes, inheritance, polymorphism, encapsulation
 */

// Base class - demonstrating encapsulation
public class Animal {
    // Private variables - encapsulation
    private String name;
    private int age;
    private double weight;
    
    // Constructor
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    // Setter methods
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
    
    // Method to be overridden
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
    
    // Display animal info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight + " lbs");
    }
}

// Subclass - demonstrating inheritance and polymorphism
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    // Method overriding - polymorphism
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof! Woof!");
    }
    
    public void fetch(String item) {
        System.out.println(getName() + " fetches the " + item);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// Another subclass
class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, int age, double weight, boolean isIndoor) {
        super(name, age, weight);
        this.isIndoor = isIndoor;
    }
    
    public boolean isIndoor() {
        return isIndoor;
    }
    
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow! Meow!");
    }
    
    public void scratch(String object) {
        System.out.println(getName() + " scratches the " + object);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Indoor: " + (isIndoor ? "Yes" : "No"));
    }
}

// Interface - demonstrating abstraction
interface Pet {
    void play();
    void train();
}

// Implementing interface
class TrainedDog extends Dog implements Pet {
    private int obedienceLevel;
    
    public TrainedDog(String name, int age, double weight, String breed, int obedienceLevel) {
        super(name, age, weight, breed);
        this.obedienceLevel = obedienceLevel;
    }
    
    @Override
    public void play() {
        System.out.println(getName() + " plays fetch and comes back immediately!");
    }
    
    @Override
    public void train() {
        System.out.println(getName() + " is being trained. Obedience level: " + obedienceLevel + "%");
    }
}

// Main class
public class OOPConcepts {
    public static void main(String[] args) {
        System.out.println("=== Java OOP Concepts ===\n");
        
        // Polymorphism - same method, different behavior
        System.out.println("--- Polymorphism (makeSound) ---");
        Dog dog = new Dog("Buddy", 5, 65.0, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 3, 10.5, true);
        
        dog.makeSound();  // Dog's implementation
        cat.makeSound();  // Cat's implementation
        System.out();
        
        // Encapsulation - accessing private variables through getters/setters
        System.out.println("--- Encapsulation ---");
        dog.displayInfo();
        System.out.println();
        cat.displayInfo();
        System.out.println();
        
        // Method overloading
        System.out.println("--- Method Usage ---");
        dog.fetch("ball");
        cat.scratch("couch");
        System.out.println();
        
        // Interface implementation
        System.out.println("--- Interface Implementation ---");
        TrainedDog trainedDog = new TrainedDog("Max", 4, 70.0, "German Shepherd", 95);
        trainedDog.displayInfo();
        trainedDog.play();
        trainedDog.train();
        trainedDog.makeSound();
        System.out.println();
        
        // Arrays and polymorphism
        System.out.println("--- Array of Animals (Polymorphism) ---");
        Animal[] animals = {dog, cat, trainedDog};
        for (Animal animal : animals) {
            animal.makeSound();
        }
        System.out.println();
        
        // Static method example
        System.out.println("--- Utility Methods ---");
        printAnimalDetails(dog);
        printAnimalDetails(cat);
    }
    
    // Static method demonstrating polymorphism parameter
    static void printAnimalDetails(Animal animal) {
        System.out.println("Animal: " + animal.getName() + 
                         ", Age: " + animal.getAge() + 
                         ", Weight: " + animal.getWeight() + " lbs");
    }
}
