package com.example.DeliveryCenter.dto;

import com.example.DeliveryCenter.model.Employee;

import java.time.LocalDate;

public class EmployeeDTO {
    private String employeeEmail;
    private String employeePassword;
    private String employeeName;
    private String employeeBirthdate;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String employeeEmail, String employeePassword, String employeeName, String employeeBirthdate) {
        this.employeeEmail = employeeEmail;
        this.employeePassword = employeePassword;
        this.employeeName = employeeName;
        this.employeeBirthdate = employeeBirthdate;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthdate() {
        return employeeBirthdate;
    }

    public void setEmployeeBirthdate(String employeeBirthdate) {
        this.employeeBirthdate = employeeBirthdate;
    }

    public Employee toEmployee() {
        return new Employee(this.employeeName, LocalDate.parse(this.employeeBirthdate), this.employeeEmail, this.employeePassword);
    }
}
