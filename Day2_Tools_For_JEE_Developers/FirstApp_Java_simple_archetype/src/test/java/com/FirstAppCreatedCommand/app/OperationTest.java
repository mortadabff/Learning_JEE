package com.FirstAppCreatedCommand.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

class OperationTest {
    private Operation operation;

    @BeforeEach
    void setUp() {
        operation = new Operation();
    }

    @Test
    void testAdd() {
        assertEquals(8, operation.add(5, 3), "5 + 3 should equal 8");
    }

    @Test
    void testSubtract() {
        assertEquals(2, operation.subtract(5, 3), "5 - 3 should equal 2");
    }

    @Test
    void testMultiply() {
        assertEquals(15, operation.multiply(5, 3), "5 * 3 should equal 15");
    }

    @Test
    void testDivide() {
        assertEquals(1, operation.divide(5, 3), "5 / 3 should equal 1");
    }

    @Test
    void testDivideByZero() {
        assertEquals(0, operation.divide(5, 0), "Division by zero should be handled gracefully");
    }
}
