package com.cts.app;

public class Course {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayCourse() {
        System.out.println("Course: " + courseName);
    }
}
