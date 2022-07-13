package com.example.eadasm.service;

import com.example.eadasm.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List< EmployeeEntity > getAllEmployees();
    void saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity getEmployeeById(Integer id);
    void deleteEmployeeById(Integer id);
}
