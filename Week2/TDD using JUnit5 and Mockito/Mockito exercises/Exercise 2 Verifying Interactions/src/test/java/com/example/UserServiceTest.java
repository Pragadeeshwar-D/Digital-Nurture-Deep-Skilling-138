package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class UserServiceTest {

    private EmailService emailServiceMock;
    private UserService userService;

    @BeforeEach
    void setUp() {
        emailServiceMock = mock(EmailService.class);
        userService = new UserService(emailServiceMock);
    }

    @Test
    void testRegisterUser_SendsWelcomeEmail() {
        // Arrange
        String email = "user@example.com";

        // Act
        userService.registerUser(email);

        // Assert - verify interaction
        verify(emailServiceMock, times(1)).sendEmail(eq(email), eq("Welcome to our service!"));

        // Verify no other interactions
        verifyNoMoreInteractions(emailServiceMock);
    }
}