package com.FirstAppCreatedCommand.app;

public class Operation {

    // Method to perform addition
    public int add(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to perform multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to perform division
    public int divide(int a, int b) {
        if (b == 0) {
            // Handle division by zero error, you might want to throw an exception or handle it differently
            System.out.println("Error: Division by zero.");
            return 0; // Return 0 for now, but consider a better error handling strategy
        }
        return a / b;
    }
}
