# Calculator Program

This simple Java program implements a basic calculator using the Model-View-Controller (MVC) pattern.

## Program Description

The program defines a `Calculator` class with methods to perform arithmetic operations. The class adheres to the MVC pattern, where:

- The model (`Calculator`) manages the calculator's state and performs calculations.
- The view and controller components are not implemented in this basic example.

## Code Explanation

```java
public class Calculator {
    private int value;

    // Method to reset the calculator to zero.
    public void reset() {
        value = 0;
    }

    // Method to add an integer to the calculator.
    public void add(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Negative integers are not allowed");
        }
        value += num;
    }

    // Method to return the current value of the calculator.
    public int getValue() {
        return value;
    }

    // Temporary main method for testing.
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
        calculator.add(3);

        System.out.println("Current value: " + calculator.getValue());
    }
}
```
* The Calculator class has the following methods:

        reset():

This method sets the calculator value to zero.

        add(int num):

Adds a positive integer to the calculator.
Throws an IllegalArgumentException for negative integers.

        getValue():

Returns the current value of the calculator.
The program includes a temporary main method for testing the functionality. Users can create an instance of the Calculator class, perform additions, and retrieve the current value.

* GitHub Copilot Usage:

Copilot assisted in generating initial explanations.
Refinement was done to ensure clarity and readability.

* Evaluation:

GitHub Copilot is handy for generating initial documentation.
Manual refinement is crucial to ensure explanations are clear and understandable.