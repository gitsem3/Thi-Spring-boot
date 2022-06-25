package com.example.thispringboot.service;

import com.example.thispringboot.entity.Employees;
import com.example.thispringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employees createEprisee(Employees employees) {
        return employeeRepository.save(employees);
    }

    public List<Employees> findAll() {
        return employeeRepository.findAll();
    }
}
