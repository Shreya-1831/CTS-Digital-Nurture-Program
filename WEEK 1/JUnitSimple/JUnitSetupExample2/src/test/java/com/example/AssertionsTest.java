package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        System.out.println("========== JUnit Assertions Test ==========");

        int expected = 5;
        int actual = 2 + 3;

        System.out.println("\nAssertion 1: assertEquals");
        System.out.println("Expected Output : " + expected);
        System.out.println("Actual Output   : " + actual);
        assertEquals(expected, actual);
        System.out.println("Status          : PASSED");

        System.out.println("\nAssertion 2: assertTrue");
        System.out.println("Condition       : 5 > 3");
        assertTrue(5 > 3);
        System.out.println("Status          : PASSED");

        System.out.println("\nAssertion 3: assertFalse");
        System.out.println("Condition       : 5 < 3");
        assertFalse(5 < 3);
        System.out.println("Status          : PASSED");

        System.out.println("\nAssertion 4: assertNull");
        System.out.println("Object          : null");
        assertNull(null);
        System.out.println("Status          : PASSED");

        System.out.println("\nAssertion 5: assertNotNull");
        Object obj = new Object();
        System.out.println("Object          : " + obj);
        assertNotNull(obj);
        System.out.println("Status          : PASSED");

        System.out.println("\n========== ALL ASSERTIONS PASSED ==========");
    }
}