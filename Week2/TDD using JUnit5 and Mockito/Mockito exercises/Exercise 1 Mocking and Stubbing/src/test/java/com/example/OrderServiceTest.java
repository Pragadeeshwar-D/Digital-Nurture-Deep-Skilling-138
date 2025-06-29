package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderServiceTest {

    private PaymentService paymentServiceMock;
    private OrderService orderService;

    @BeforeEach
    void setUp() {
        paymentServiceMock = Mockito.mock(PaymentService.class);
        orderService = new OrderService(paymentServiceMock);
    }

    @Test
    void testPlaceOrder_SuccessfulPayment() {
        // Arrange
        when(paymentServiceMock.charge(100.0)).thenReturn(true);

        // Act
        boolean result = orderService.placeOrder(100.0);

        // Assert
        assertTrue(result);
        verify(paymentServiceMock, times(1)).charge(100.0);
    }

    @Test
    void testPlaceOrder_FailedPayment() {
        // Arrange
        when(paymentServiceMock.charge(200.0)).thenReturn(false);

        // Act
        boolean result = orderService.placeOrder(200.0);

        // Assert
        assertFalse(result);
        verify(paymentServiceMock, times(1)).charge(200.0);
    }
}