package com.example;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class VerifyInteractionTest {

    @Test
    public void testVerifyInteraction() {

        System.out.println("\n======================================");
        System.out.println(" Mockito - Verifying Interactions ");
        System.out.println("======================================");

        // Arrange
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        System.out.println("Step 1 : Mock object created");

        // Act
        service.fetchData();

        System.out.println("Step 2 : fetchData() method invoked");

        // Verify
        verify(mockApi).getData();

        System.out.println("Step 3 : Verified that getData() was called");

        System.out.println("\nStatus : TEST PASSED");
        System.out.println("======================================");
    }
}