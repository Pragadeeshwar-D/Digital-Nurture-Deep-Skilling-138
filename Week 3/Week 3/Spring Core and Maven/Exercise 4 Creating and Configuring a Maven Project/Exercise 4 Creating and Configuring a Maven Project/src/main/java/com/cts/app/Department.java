package com.cts.app;

public class Department {
    private String departmentName;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void showDepartmentName() {
        System.out.println("Department: " + departmentName);
    }
}
