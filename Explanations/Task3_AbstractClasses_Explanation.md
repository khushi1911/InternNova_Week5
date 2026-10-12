# Task 3: Abstract Classes — Shape Calculator

### Objective

To demonstrate how abstract classes define common methods and allow subclasses to provide their own implementations.

### Concept

An abstract class cannot be instantiated directly. It can contain abstract methods without implementations and normal methods with implementations. The `extends` keyword allows another class to inherit from it.

### Working

The abstract class `Shape` declares the abstract method `calculateArea()` and provides a normal method called `displayMessage()`. The `Circle` and `Rectangle` classes extend `Shape` and implement `calculateArea()` using their respective formulas. The main method creates objects of both shapes and displays their calculated areas.

### Concepts Used

- Abstract classes and methods
- `abstract` and `extends` keywords
- Method overriding
- Inheritance
- Area calculations
