package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        System.out.println("\n===============================");
        System.out.println(" Mockito Mocking and Stubbing ");
        System.out.println("===============================");

        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        System.out.println("Step 1 : Mock object created");
        System.out.println("Step 2 : Stubbed getData() -> \"Mock Data\"");

        // Act
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert
        System.out.println("\nExpected Output : Mock Data");
        System.out.println("Actual Output   : " + result);

        assertEquals("Mock Data", result);

        System.out.println("\nStatus : TEST PASSED");
        System.out.println("===============================");
    }
}