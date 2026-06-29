package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAAPatternTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("========== SETUP ==========");
        System.out.println("Creating Calculator object...");
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {

        // Arrange
        int num1 = 10;
        int num2 = 20;
        int expected = 30;

        System.out.println("\n========== AAA PATTERN ==========");
        System.out.println("Arrange");
        System.out.println("Input 1 : " + num1);
        System.out.println("Input 2 : " + num2);

        // Act
        int actual = calculator.add(num1, num2);

        System.out.println("\nAct");
        System.out.println("Actual Output : " + actual);

        // Assert
        System.out.println("\nAssert");
        assertEquals(expected, actual);
        System.out.println("Expected Output : " + expected);
        System.out.println("Result : TEST PASSED");
    }

    @After
    public void tearDown() {
        System.out.println("\n========== TEARDOWN ==========");
        System.out.println("Destroying Calculator object...");
        calculator = null;
    }
}