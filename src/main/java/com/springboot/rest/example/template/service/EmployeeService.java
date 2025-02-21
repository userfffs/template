package com.springboot.rest.example.template.service;

import com.springboot.rest.example.template.model.Employee;
import com.springboot.rest.example.template.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}