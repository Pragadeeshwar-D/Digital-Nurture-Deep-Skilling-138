package com.cts.app;

public class Student {
    private int id;
    private String name;
    private Course course;

    // Setters for Dependency Injection
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        course.displayCourse();
    }
}
