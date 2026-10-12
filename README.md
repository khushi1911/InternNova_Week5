# Java Advanced Concepts

A collection of Java programs demonstrating packages, interfaces, abstract classes, file handling, and multithreading through practical examples.

## Objective

To develop an understanding of advanced Java concepts through hands-on programming tasks.

## Technologies Used

* Java
* JDK 26
* Visual Studio Code
* Git and GitHub

## Projects

### 1. Packages — Organizing Java Code

Demonstrates creating a custom `studentmanagement` package and accessing the `Student` class from another Java file.

**Concepts:** Packages, imports, classes, and objects.

### 2. Interfaces — Payment System

Implements a `Payment` interface using separate UPI and card payment classes.

**Concepts:** Interfaces, implementation, and polymorphism.

### 3. Abstract Classes — Shape Calculator

Uses an abstract `Shape` class with `Circle` and `Rectangle` subclasses to calculate areas.

**Concepts:** Abstraction, inheritance, and method overriding.

### 4. File Handling — Student Records

Writes student information to a text file and reads the saved data back into the console.

**Concepts:** File handling, input/output streams, and exception handling.

### 5. Multithreading — Multiple Tasks

Creates two threads that independently perform different tasks.

**Concepts:** Threads, the `run()` method, the `start()` method, and concurrent execution.

## Repository Structure

* `Task1_Packages/` — Custom package demonstration
* `Task2_Interfaces/` — Payment interface implementation
* `Task3_AbstractClasses/` — Abstract shape calculator
* `Task4_FileHandling/` — Student file operations
* `Task5_Multithreading/` — Multiple thread execution
* `Screenshots/` — Program output screenshots
* `Explanations/` — Task-wise explanations

## How to Run

Ensure that Java is installed and available in your terminal.

Navigate to the folder containing the Java file you want to execute, then compile and run it.

For example, for Task 2:

```bash
cd Task2_Interfaces
javac PaymentDemo.java
java PaymentDemo
```

For Task 1, compile from inside `Task1_Packages`:

```bash
javac -d . studentmanagement/Student.java Main.java
java Main
```

## Learning Outcomes

* Organizing Java code using packages
* Implementing interfaces
* Applying abstraction and inheritance
* Reading and writing text files
* Creating and starting threads
* Handling exceptions during file operations

## Acknowledgement

Completed as part of the InternNova Java Development Internship — Week 5 Assignment.
