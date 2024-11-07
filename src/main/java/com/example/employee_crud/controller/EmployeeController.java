package com.example.employee_crud.controller;

import com.example.employee_crud.model.Employee;
import com.example.employee_crud.services.EmployeeService;

import jakarta.annotation.security.PermitAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("hi")
    public String sayHello(){
        return  "Hello from Toronto: ";
    }
    
    @GetMapping
    public List<Employee> getAllEmployees(){
        return  employeeService.getAllEmployees()   ;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            employee.setName(employeeDetails.getName());
            employee.setPosition(employeeDetails.getPosition());
            employee.setSalary(employeeDetails.getSalary());
            employee.setActive(employeeDetails.getActive());
            employee.setHireDate(employeeDetails.getHireDate());
            employee.setNotes(employeeDetails.getNotes());
            return employeeService.saveEmployee(employee);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
