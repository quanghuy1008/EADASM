package com.example.eadasm.service;

import com.example.eadasm.entity.EmployeeEntity;
import com.example.eadasm.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<EmployeeEntity> getALlEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public void saveEmployeeById(EmployeeEntity employeeEntity) {
        this.employeeRepo.save(employeeEntity);
    }

    @Override
    public EmployeeEntity getEmployeeById(Integer id) {
        Optional< EmployeeEntity > optional = employeeRepo.findById( id);
        EmployeeEntity employeeEntity = null;
        if (optional.isPresent()) {
            employeeEntity = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employeeEntity;
    }

    @Override
    public void deleteEmployeeById(Integer id) {
        this.employeeRepo.deleteById( id);
    }
}
