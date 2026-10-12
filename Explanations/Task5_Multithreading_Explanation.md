# Task 5: Multithreading Basics — Multiple Tasks

### Objective

To demonstrate how two Java threads can execute different tasks concurrently.

### Concept

Multithreading allows multiple threads to make progress within a program. A thread can be created by extending the `Thread` class and overriding its `run()` method. Calling `start()` begins the thread's execution.

### Working

The program creates two threads. `NumberThread` prints numbers from 1 to 10, while `MessageThread` prints a multithreading message five times. Both threads are started using the `start()` method, allowing their output to interleave.

### Concepts Used

- Multithreading
- `Thread` class
- `run()` method
- `start()` method
- Concurrent execution
