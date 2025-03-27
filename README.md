# README



## 1. Encapsulation 

### Student Class Implementation
- The `Student` class demonstrates encapsulation by:
    - Declaring private attributes: `name` and `grade`.
    - Providing public getter and setter methods to access and modify these attributes.
    - Ensuring that the `grade` is within the range of 0 to 100; if an invalid value is provided, it defaults to 0.



## 2. Method Overloading and Overriding 

### Method Overloading
- Implemented in the `MathOperations` class by defining two `multiply()` methods:
    - One method accepts two integers and returns their product.
    - Another method accepts three integers and returns their product.

### Method Overriding and Polymorphism
- Implemented in an `Animal` class hierarchy:
    - The `Animal` class contains a `makeSound()` method.
    - The `Dog` and `Cat` classes override `makeSound()` with their specific implementations.
    - Polymorphism is demonstrated by calling `makeSound()` on instances of both subclasses.

---

## 3. Abstraction and Exception Handling in Java 

### Abstraction 
- Implemented using an abstract class `Appliance`:
    - The `Appliance` class contains an abstract method `turnOn()`.
    - Subclasses `Fan` and `TV` provide their own implementations of `turnOn()`.
    - The program demonstrates abstraction by creating objects and invoking `turnOn()` on them.

### Exception Handling 
- Implemented to handle division operations safely:
    - The program accepts two numbers from the user and attempts to divide the first by the second.
    - If the second number is zero, an `ArithmeticException` is caught.
    - A meaningful message, "Cannot divide by zero!", is displayed to the user.

---

## How to Run the Code
1. Compile the Java files using a Java compiler:
   ```sh
   javac *.java
   ```
2. Run the main class containing the test cases:
   ```sh
   java MainClass
   ```

---

## Requirements
- Java Development Kit (JDK) installed.
- Basic understanding of Java syntax and OOP concepts.

---

## Author
- Joy Andati.

---

## File Structure
```
|-- src/
|   |-- Student.java
|   |-- MathOperations.java
|   |-- Animal.java
|   |-- Dog.java
|   |-- Cat.java
|   |-- Appliance.java
|   |-- Fan.java
|   |-- TV.java
|   |-- ExceptionHandling.java
|-- MainClass.java
|-- README.md
```

This structure helps maintain organization and clarity in the project files.
