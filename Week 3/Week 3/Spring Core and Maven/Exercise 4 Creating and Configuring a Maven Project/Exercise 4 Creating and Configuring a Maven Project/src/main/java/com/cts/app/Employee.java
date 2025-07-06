package com.cts.app;

public class Employee {
    private int employeeId;
    private String employeeName;
    private Department department;

    // Setters for DI
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // Method to display employee info
    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        department.showDepartmentName();
    }
}
