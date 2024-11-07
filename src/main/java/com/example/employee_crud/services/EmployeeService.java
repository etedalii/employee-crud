package com.example.employee_crud.services;

import com.example.employee_crud.model.Employee;
import com.example.employee_crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return  employeeRepository.findAll();
    }

    public  Employee getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return  !employee.isEmpty() ? employee.get() : new Employee();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
