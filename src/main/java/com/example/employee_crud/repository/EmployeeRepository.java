package com.example.employee_crud.repository;

import com.example.employee_crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {
}
