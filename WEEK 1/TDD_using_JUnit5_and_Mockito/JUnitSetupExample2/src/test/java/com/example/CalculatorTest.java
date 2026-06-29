package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator calculator = new Calculator();

        int expected = 10;
        int actual = calculator.add(4, 6);

        System.out.println("===== JUnit Test Execution =====");
        System.out.println("Input 1 : 4");
        System.out.println("Input 2 : 6");
        System.out.println("Expected Output : " + expected);
        System.out.println("Actual Output   : " + actual);

        assertEquals(expected, actual);

        System.out.println("Result : TEST PASSED");
    }
}