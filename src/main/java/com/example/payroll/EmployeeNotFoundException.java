package com.example.payroll;

public class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(Long id){
        super("Employee with id " + id + " not found");
    }
}
