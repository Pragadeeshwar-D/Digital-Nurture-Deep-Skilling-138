package com.example;

public class UserService {
    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
        // Imagine user is registered here
        emailService.sendEmail(email, "Welcome to our service!");
    }
}